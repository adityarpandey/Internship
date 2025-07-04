package com.example.postDatabase;

import com.example.postDatabase.property.Author;
import com.example.postDatabase.property.Book;

public class TestDataUtil {

    public static Author getAuthorA() {
        return Author.builder()
                .idbs(1L).name("aditya").age(50).build();
    }
    public static Author getAuthorB() {
        return Author.builder()
                .idbs(1L).name("aditya").age(50).build();
    }
    public static Author getAuthorC() {
        return Author.builder()
                .idbs(1L).name("aditya").age(50).build();
    }
    public static Book getBook() {
        return Book.builder().id(9000 - 1000 - 90L).name("tail of 2 cities").authorId(2L).build();
    }
}
