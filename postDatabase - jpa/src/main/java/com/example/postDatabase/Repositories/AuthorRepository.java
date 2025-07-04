package com.example.postDatabase.Repositories;

import com.example.postDatabase.Domain.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author , Long> {
    @Query(value = "select * from Authors where name = :name",nativeQuery = true)
    Author findByName(String name);
}
