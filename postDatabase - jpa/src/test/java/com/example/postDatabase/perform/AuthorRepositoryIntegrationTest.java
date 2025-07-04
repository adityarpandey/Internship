package com.example.postDatabase.perform;

import com.example.postDatabase.Domain.Author;
import com.example.postDatabase.Repositories.AuthorRepository;

//import com.example.postDatabase.impl.AuthorDoaIMPL;

import com.example.postDatabase.TestDataUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AuthorRepositoryIntegrationTest {

    private AuthorRepository undertest;
    @Autowired
    public AuthorRepositoryIntegrationTest(AuthorRepository undertest){
        this.undertest = undertest;
    }
    @Test
    public void createAndreCalledTest(){

        Author author = TestDataUtil.createTestAuthorEntityA();
        undertest.save(author);
//        Author expectAuthor = TestDataUtil.expectedAuthorA();
        Optional<Author> result = undertest.findById(author.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(author);
    }
    @Test
    public void multiCreateAndreCalledTest(){
        Author authorA = TestDataUtil.createTestAuthorEntityA();
        undertest.save(authorA);
        Author authorB = TestDataUtil.createTestAuthorB();
        undertest.save(authorB);
        Author authorC = TestDataUtil.createTestAuthorC();
        undertest.save(authorC);

        Iterable<Author> result = undertest.findAll();
        assertThat(result).hasSize(3).containsExactly(authorA,authorB,authorC);
    }
    @Test
    public void testAuthorUpdate(){
    Author authorA = TestDataUtil.createTestAuthorEntityA();
    undertest.save(authorA);
    authorA.setName("UPDATED");
    undertest.save( authorA);

    Optional<Author> result = undertest.findById(authorA.getId());
    assertThat(result).isPresent();
    assertThat(result.get()).isEqualTo(authorA);
    }

}
