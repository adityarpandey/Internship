package com.example.ManagementProject.Service;

import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface DocumentService {

     void upload(MultipartFile file , Long projectId) throws Exception;

   Optional<DocumentEntity> findOne(Long documentId);

     void delete(Long documentId);
}
