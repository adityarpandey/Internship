package com.example.ManagementProject.Service;

import com.example.ManagementProject.Domain.Entity.ProjectEntity;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    ProjectEntity save(ProjectEntity projectEntity);

    List<ProjectEntity> findAll();

    Optional<ProjectEntity> findOne(Long id);

     boolean isExists(Long id);

     void delete(Long id);
}
