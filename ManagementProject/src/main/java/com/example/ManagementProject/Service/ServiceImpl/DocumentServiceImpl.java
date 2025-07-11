package com.example.ManagementProject.Service.ServiceImpl;

import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import com.example.ManagementProject.Domain.Entity.ProjectEntity;
import com.example.ManagementProject.Repository.DocumentRepository;
import com.example.ManagementProject.Repository.ProjectRepository;
import com.example.ManagementProject.Service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Value("${document.path}")
    String documentPath;

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public void upload(MultipartFile file, Long projectId) {
        Optional<ProjectEntity> projectEntityOptional = projectRepository.findById(projectId);

        if(projectEntityOptional.isPresent()) {
            ProjectEntity project = projectEntityOptional.get();
            String path =documentPath + "/" + project.getName() + "/" + file.getOriginalFilename();


            String name = file.getName();

            Long size = file.getSize();

            DocumentEntity document = new DocumentEntity();
                    document.setName(name);
                    document.setSize(size);
                    document.setPath(path);
                    document.setProject(project);
            DocumentEntity optionalDocumentEntity = documentRepository.save(document);
            System.out.println(optionalDocumentEntity);

        }else{
            System.out.println("error");
        }
    }

    @Override
    public Optional<DocumentEntity> findOne(Long documentId) {
        return documentRepository.findById(documentId);
    }

    @Override
    public void delete(Long documentId) {
        documentRepository.deleteById(documentId);
    }
}
