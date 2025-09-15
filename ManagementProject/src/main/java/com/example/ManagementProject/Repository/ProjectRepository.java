package com.example.ManagementProject.Repository;


import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity , Long> {
}
