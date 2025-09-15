package com.example.ManagementProject.Controller;

import com.example.ManagementProject.Domain.DTO.ProjectDto;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Service.ProjectService;
import com.example.ManagementProject.TestDataUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class ProjectControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private ProjectService projectService;


//  public ProjectControllerIntegrationTest(ProjectService projectService ) {
//        this.mockMvc = mockMvc;
//        this.objectMapper = new ObjectMapper();
//        this.projectService = projectService;
//    }

    @Test
    public void testThatCreateProjectReturnsHttp201Created() throws Exception {
        ProjectEntity projectEntity = TestDataUtil.createProjectA();
        projectEntity.setId(null);
        String Json = objectMapper.writeValueAsString(projectEntity);

        mockMvc.perform(
                MockMvcRequestBuilders.post("/projects")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Json)

        ).andExpect(
                MockMvcResultMatchers.status().isCreated()
        );
    }

    @Test
    public void testThatCreateProjectReturnSavedProject()throws Exception{
        ProjectEntity projectEntity = TestDataUtil.createProjectA();
        projectEntity.setId(null);
        String Json = objectMapper.writeValueAsString(projectEntity);
        System.out.println(Json);
        mockMvc.perform(
                MockMvcRequestBuilders.post("/projects").contentType(MediaType.APPLICATION_JSON).content(Json)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.id").isNumber()
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.name").value("baudoku")
        );

    }
    @Test
    public void testThatFindAllReturnsHttp201Created() throws Exception {
//        ProjectEntity projectEntity = TestDataUtil.createProjectA();
//        projectEntity.setId(null);
//        String Json = objectMapper.writeValueAsString(projectEntity);

        mockMvc.perform(
                MockMvcRequestBuilders.get("/projects")
                        .contentType(MediaType.APPLICATION_JSON)


        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }
    @Test
    public void testThatFindAllReturnSavedProject()throws Exception{

        mockMvc.perform(
                MockMvcRequestBuilders.get("/projects").contentType(MediaType.APPLICATION_JSON)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$[0].id").isNumber()
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$[0].name").value("baudoku")
        );

    }
    @Test
    public void testThatUpdateReturnsHttp201Created() throws Exception {
        ProjectEntity projectEntity = TestDataUtil.createProjectA();
        ProjectEntity saveProject = projectService.save(projectEntity);


        ProjectDto projectDto = TestDataUtil.createProjectDtoA();
        String Json = objectMapper.writeValueAsString(projectDto);

        mockMvc.perform(
                MockMvcRequestBuilders.put("/projects/" + saveProject.getId())
                        .contentType(MediaType.APPLICATION_JSON).content(Json)


        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }

    @Test
    public void testThatUpdateReturnSavedProject()throws Exception{

        ProjectEntity projectEntity = TestDataUtil.createProjectA();
        ProjectEntity saveProject = projectService.save(projectEntity);


        ProjectDto projectDto = TestDataUtil.createProjectDtoA();
        String Json = objectMapper.writeValueAsString(projectDto);
        mockMvc.perform(
                MockMvcRequestBuilders.put("/projects/" +saveProject.getId()).contentType(MediaType.APPLICATION_JSON).content(Json)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.id").isNumber()
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.name").value("baudoku")
        );

    }

    @Test
    public void testThatDeleteReturnsHttp204NoContent() throws Exception {
        ProjectEntity projectEntity = TestDataUtil.createProjectA();
        ProjectEntity saveProject = projectService.save(projectEntity);



        mockMvc.perform(
                MockMvcRequestBuilders.delete("/projects/" + saveProject.getId())
                        .contentType(MediaType.APPLICATION_JSON)


        ).andExpect(
                MockMvcResultMatchers.status().isNoContent()
        );
    }






}
