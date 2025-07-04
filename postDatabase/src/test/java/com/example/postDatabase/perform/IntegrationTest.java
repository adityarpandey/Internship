package com.example.postDatabase.perform;

import com.example.postDatabase.TestDataUtil;
import com.example.postDatabase.impl.AuthorDaoIMPL;
import com.example.postDatabase.property.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Optional;



@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class IntegrationTest {

    private AuthorDaoIMPL undertest;
    @Autowired
    public IntegrationTest(AuthorDaoIMPL undertest){
        this.undertest = undertest;
    }
    @Test
    public void createAndreCalledTest(){

        Author author = TestDataUtil.getAuthorA();
        undertest.create(author);
        Optional<Author> result = undertest.findOne(author.getIdbs());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(author);
    }
    @Test
    public void multiCreateAndreCalledTest(){
        Author authorA = TestDataUtil.getAuthorA();
        undertest.create(authorA);
        Author authorB = TestDataUtil.getAuthorA();
        undertest.create(authorB);
        Author authorC = TestDataUtil.getAuthorA();
        undertest.create(authorC);

        List<Author> result = undertest.find();
        assertThat(result).hasSize(3).containsExactly(authorA,authorB,authorC);
    }
    @Test
    public void testAuthorUpdate(){
    Author authorA = TestDataUtil.getAuthorA();
    undertest.create(authorA);
    authorA.setName("UPDATED");
    undertest.update(authorA.getIdbs(), authorA);
    Optional<Author> result = undertest.findOne(authorA.getIdbs());
    assertThat(result).isPresent();
    assertThat(result.get()).isEqualTo(authorA);
    }

}
