package com.example.postDatabase.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "Books")
public class Book {
    @Id
    private String idbs;

    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Author_id")
    private Author author;


}

