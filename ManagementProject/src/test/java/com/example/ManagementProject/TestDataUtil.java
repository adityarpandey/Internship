package com.example.ManagementProject;

import com.example.ManagementProject.Domain.DTO.ProjectDto;
import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Service.ServiceImpl.DocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;


public class TestDataUtil {

//    @Autowired
//    private DocumentServiceImpl documentServiceImpl;

    public static ProjectEntity createProjectA(){
        ProjectEntity projectEntity = new ProjectEntity();;
        projectEntity.setId(852L);
        projectEntity.setName("baudoku");
        return projectEntity;
    }

    public static ProjectDto createProjectDtoA(){
        ProjectDto projectDto = new ProjectDto();;
        projectDto.setId(852L);
        projectDto.setName("baudoku");
        return projectDto;
}
    public static MockMultipartFile uploadDocument(){

        // matches @RequestParam name
        return new MockMultipartFile("file",               // matches @RequestParam name
                "test.txt",
                "text/plain",
                "hello".getBytes());

    }

    public static DocumentEntity mataData(){

         DocumentEntity document = new DocumentEntity();
         document.setName("file");


         return document;
    }
}
