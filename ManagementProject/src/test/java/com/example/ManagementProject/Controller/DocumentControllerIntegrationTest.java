package com.example.ManagementProject.Controller;

import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Service.DocumentService;
import com.example.ManagementProject.TestDataUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class DocumentControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private DocumentService documentService;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public void testForUpload() throws Exception {

        MockMultipartFile file = TestDataUtil.uploadDocument();

        mockMvc.perform(
                        MockMvcRequestBuilders.multipart("/documents/2/upload")
                                .file(file)          // attach the mock file
                                .characterEncoding("UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testForMetaData() throws Exception {

        DocumentEntity document = TestDataUtil.mataData();
        MockMultipartFile file = TestDataUtil.uploadDocument();

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/documents/2/metadata").contentType(MediaType.APPLICATION_JSON)          // attach the mock file

        ).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testForDelete() throws Exception {

        MockMultipartFile file = TestDataUtil.uploadDocument();

        mockMvc.perform(
                        MockMvcRequestBuilders.delete("/documents/2/delete").contentType(MediaType.APPLICATION_JSON)

        ).andExpect(MockMvcResultMatchers.status().isNoContent());
    }


}
