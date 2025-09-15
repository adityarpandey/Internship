package com.example.ManagementProject.Controller;

import com.example.ManagementProject.Domain.DTO.ProjectDto;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Mapper.Mapper;
import com.example.ManagementProject.Service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ProjectController {

    private ProjectService projectService;

    private Mapper<ProjectEntity , ProjectDto> projectMapper;


    public ProjectController(ProjectService projectService,Mapper<ProjectEntity , ProjectDto> projectMapper) {
        this.projectService = projectService;
        this.projectMapper = projectMapper;
    }

    @PostMapping(path ="/projects")
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto project){

        ProjectEntity projectEntity = projectMapper.mapFrom(project);
        ProjectEntity saveProjectEntity =projectService.save(projectEntity);
        return new ResponseEntity<>(projectMapper.mapTo(saveProjectEntity),HttpStatus.CREATED);
    }

    @GetMapping(path = "/projects")
    public List<ProjectDto> listOfProject(){
        List<ProjectEntity> project = projectService.findAll();
        return project.stream().map(projectMapper::mapTo).collect(Collectors.toList());
    }

    @GetMapping(path ="/projects/{id}")
    public ResponseEntity<ProjectDto> GetById(@PathVariable("id")  Long id){
        Optional<ProjectEntity> foundProject = projectService.findOne(id);
        return foundProject.map(ProjectEntity ->{
            ProjectDto projectDto = projectMapper.mapTo(ProjectEntity);
            return new ResponseEntity<>(projectDto ,HttpStatus.OK);
        }).orElse(
                new ResponseEntity<>(HttpStatus.NOT_FOUND)
        );
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<ProjectDto> fullUpdate(@PathVariable("id") Long id , @RequestBody ProjectDto projectDto ){

        if(!projectService.isExists(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        projectDto.setId(id);
        projectDto.setCreatedOn(LocalDateTime.now());
        ProjectEntity projectEntity = projectMapper.mapFrom(projectDto);


        ProjectEntity saveProjectEntity = projectService.save(projectEntity);

        return new ResponseEntity<>(projectMapper.mapTo(saveProjectEntity) , HttpStatus.OK);

    }

    @DeleteMapping(path = "/projects/{id}")
    public ResponseEntity deleteProject(@PathVariable("id") Long id){
        projectService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
