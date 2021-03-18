package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.BookedActivity;
import com.fim.wilstra.campDragonFire.model.repository.BookedActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedActivityService {
    @Autowired
    private BookedActivityRepository bookedActivityRepository;

    public List<BookedActivity> listAll() {
        return (List<BookedActivity>) bookedActivityRepository.findAll();
    }

    public void save(BookedActivity bookedActivity) {
        bookedActivityRepository.save(bookedActivity);
    }

    public BookedActivity get(Integer id) {
        return bookedActivityRepository.findById(id).get();
    }

    public void delete(Integer id) {
        bookedActivityRepository.deleteById(id);
    }

}
