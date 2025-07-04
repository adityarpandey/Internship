package com.example.Json;

import com.example.Json.Domain.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JacksonTest {

    @Test
    void testThatObjectMapperCanMakeJavaObjectFromJsonObject() throws JsonProcessingException {
        Book book = Book.builder()
                .isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();
        String json = "{\"isbn\":\"978-0-13-478627-5\",\"title\":\"The Enigma of Eternity\",\"author\":\"Aria"
                + " Montgomery\",\"year\":\"2005\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Book result = objectMapper.readValue(json , Book.class);
        assertThat(result).isEqualTo(book);
    }
}
