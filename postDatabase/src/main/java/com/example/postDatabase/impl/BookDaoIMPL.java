package com.example.postDatabase.impl;

import com.example.postDatabase.Dao.bookDao;
import com.example.postDatabase.property.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoIMPL implements bookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoIMPL(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

   public void create(Book book){
        jdbcTemplate.update(
                "INSERT INTO book (id , name , authorId) VALUES (?,?,?)",
                                  book.getId(),book.getName(),book.getAuthorId()        );
}
}