package com.example.postDatabase.impl;

import com.example.postDatabase.Dao.authorDao;
import com.example.postDatabase.property.Author;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@Component
public class AuthorDaoIMPL implements authorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoIMPL(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update(
                "INSERT INTO author (idbs , name , age) VALUES(?,?,?)",
                author.getIdbs(), author.getName(), author.getAge()
        );


    }

    @Override
    public Optional<Author> findOne(long authorId) {
        List<Author> result = jdbcTemplate.query("SELECT idbs,name,age FROM author WHERE id = ? LIMIT 1",
                new authorRowMapper(), authorId);
        return result.stream().findFirst();
    }

    public static class authorRowMapper implements RowMapper<Author> {
        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Author.builder().
                    idbs(rs.getLong("id")).name(rs.getString("name")).age(rs.getInt("age")).build();
        }
    }

    @Override
    public List<Author> find() {
        return jdbcTemplate.query("SELECT idbs,name,age FROM author",
                new authorRowMapper());
    }

    @Override
    public void update(long idbs , Author author) {
        jdbcTemplate.update("UPDATE author SET idbs = ? , name = ? , age = ? WHERE id = ?",idbs,author.getName(),author.getAge());
    }

}
