package com.example.postDatabase.perform;

import com.example.postDatabase.TestDataUtil;
import com.example.postDatabase.impl.AuthorDaoIMPL;
import com.example.postDatabase.property.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static com.example.postDatabase.TestDataUtil.getAuthorA;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class authorDaoImplTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoIMPL undertest;

    @Test

    void Daftest(){
        Author author = getAuthorA();
        undertest.create(author);

        verify(jdbcTemplate).update(
                eq("INSERT INTO author (idbs , name , age) VALUES(?,?,?)"),
                eq(1L),eq("aditya"),eq(50)
        );
    }



    @Test
    public void authorFindTest(){
        undertest.findOne(1L);

        verify(jdbcTemplate).query(
                eq("SELECT idbs,name,age FROM author WHERE id = ? LIMIT 1"),
                 ArgumentMatchers.<AuthorDaoIMPL.authorRowMapper>any(),eq(1L));
    }
    @Test
    public void multipleAuthor(){
        undertest.find();
        verify(jdbcTemplate).query(
                eq("SELECT idbs,name,age FROM author"),
               ArgumentMatchers.<AuthorDaoIMPL.authorRowMapper>any() );
    }
    @Test
    public void authorUpdate(){
        Author author = TestDataUtil.getAuthorA();
        undertest.update(author.getIdbs() , author);

        verify(jdbcTemplate).update("UPDATE author SET idbs = ? , name = ? , age = ? WHERE id = ?", 1L , "aadi",80,1L );
    }




}
