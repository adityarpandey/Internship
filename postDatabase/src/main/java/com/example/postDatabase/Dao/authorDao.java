package com.example.postDatabase.Dao;

import com.example.postDatabase.property.Author;

import java.util.List;
import java.util.Optional;

public interface authorDao {


    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();

    void update(long idbs ,Author author);


}
