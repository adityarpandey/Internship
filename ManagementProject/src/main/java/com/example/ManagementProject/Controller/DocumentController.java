package com.example.ManagementProject.Controller;

import com.example.ManagementProject.Domain.Entity.DocumentEntity;
import com.example.ManagementProject.Service.DocumentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
@RequestMapping(path = "/documents")
public class DocumentController {
    private DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/{projectId}/upload")
    public ResponseEntity<Void> uploadFile(@PathVariable("projectId") Long projectId ,
                                      @RequestParam("file")  MultipartFile file) throws Exception {


        documentService.upload(file ,projectId);
        return ResponseEntity.ok().build();

    }

    @GetMapping(path = "/{documentId}/metadata")
    public ResponseEntity<Optional<DocumentEntity>> metaData(@PathVariable Long documentId ){

        Optional<DocumentEntity> document = documentService.findOne(documentId);
        return new ResponseEntity<>(document ,HttpStatus.OK);
    }

    @DeleteMapping(path = "/{documentId}/delete")
    public ResponseEntity deleteDoc(@PathVariable Long documentId) {
        Optional<DocumentEntity> document = documentService.findOne(documentId);
        documentService.delete(documentId);

        return new ResponseEntity (HttpStatus.NO_CONTENT);
    }



}
