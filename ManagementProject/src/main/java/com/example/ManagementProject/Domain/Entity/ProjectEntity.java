package com.example.ManagementProject.Domain.Entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;
import java.time.LocalDateTime;


@NoArgsConstructor
@Entity
@Table(name = "projects")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "project_id_seq")
    private Long id;

    private String name;

    private LocalDateTime createdOn;

    @PrePersist
    protected void onCreate(){
        this.createdOn = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
