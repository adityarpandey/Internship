package com.example.postDatabase.perform;

import com.example.postDatabase.impl.BookDaoIMPL;
import com.example.postDatabase.property.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static com.example.postDatabase.TestDataUtil.getBook;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class bookDaoImplTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoIMPL underTest;

    @Test
    void DoaBookTest(){
        Book book = getBook();

        underTest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO book (id , name , authorId) VALUES (?,?,?)"),
                eq("9000-1000-90L"),
                eq("tail of 2 cities"),
                eq("2L"));
    }


}
