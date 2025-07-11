package com.example.ManagementProject.Repository;

import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<DocumentEntity , Long >{
}
