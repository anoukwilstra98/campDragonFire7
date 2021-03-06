package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.BookedActivity;
import com.fim.wilstra.campDragonFire.model.service.BookedActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookedActivities")
public class BookedActivityController {

    @Autowired
    BookedActivityService bookedActivityservice;

    @GetMapping("/")
    public List<BookedActivity> list() {
        return bookedActivityservice.listAll();
    }
}
