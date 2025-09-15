package com.example.ManagementProject.Mapper.MapperImpl;


import com.example.ManagementProject.Domain.DTO.ProjectDto;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class ProjectMapperImpl implements Mapper<ProjectEntity, ProjectDto> {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ProjectDto mapTo(ProjectEntity projectEntity) {
        return modelMapper.map(projectEntity ,ProjectDto.class);
    }

    @Override
    public ProjectEntity mapFrom(ProjectDto projectDto) {
        return modelMapper.map(projectDto ,ProjectEntity.class);
    }
}
