package com.example.ManagementProject.Service.ServiceImpl;

import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Repository.ProjectRepository;
import com.example.ManagementProject.Service.ProjectService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectEntity save(ProjectEntity projectEntity) {
//        projectEntity.setCreatedOn(LocalDateTime.now());
        return projectRepository.save(projectEntity);
    }

    @Override
    public List<ProjectEntity> findAll() {
        return StreamSupport.stream(projectRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public Optional<ProjectEntity> findOne(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public boolean isExists(Long id) {
        return projectRepository.existsById(id);
    }

    @Override
    public void delete(Long id) {
         projectRepository.deleteById(id);
    }


}
