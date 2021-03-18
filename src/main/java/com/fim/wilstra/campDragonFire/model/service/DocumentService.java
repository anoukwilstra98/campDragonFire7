package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Document;
import com.fim.wilstra.campDragonFire.model.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> listAll() {
        return (List<Document>) documentRepository.findAll();
    }

    public void save(Document document) {
        documentRepository.save(document);
    }

    public Document get(Integer id) {
        return documentRepository.findById(id).get();
    }

    public void delete(Integer id) {
        documentRepository.deleteById(id);
    }

}
