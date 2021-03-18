package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Contact;
import com.fim.wilstra.campDragonFire.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> listAll() {
        return (List<Contact>) contactRepository.findAll();
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public Contact get(Integer id) {
        return contactRepository.findById(id).get();
    }

    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }

}
