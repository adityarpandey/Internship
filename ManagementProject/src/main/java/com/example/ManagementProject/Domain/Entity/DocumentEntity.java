package com.example.ManagementProject.Domain.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;


@NoArgsConstructor
@Entity
@Table(name = "documents")

public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "document_id_seq")
    private Long id;

    private String name;

    private String path;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public LocalDateTime getUploadedOn() {
        return uploadedOn;
    }

    public void setUploadedOn(LocalDateTime uploadedOn) {
        this.uploadedOn = uploadedOn;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    private Long size;

    private LocalDateTime uploadedOn;
    @PrePersist
    protected void on_Uploaded(){
        this.uploadedOn = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;


}
