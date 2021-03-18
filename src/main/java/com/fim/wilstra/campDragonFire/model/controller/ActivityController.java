package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.Activity;
import com.fim.wilstra.campDragonFire.model.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    ActivityService activityService;

    //http requests use getmapping + location
    @GetMapping("/activities")
    public List<Activity> list() {
        return activityService.listAll();
    }

    //todo deal with  noSuchElementException
    @GetMapping("/activities/{id}")
    public Activity get(@PathVariable Integer id) {
        return activityService.get(id);
    }

    @PostMapping("/activities")
    public void add(@RequestBody Activity activity) {
        activityService.save(activity);
    } //requestbody turns info into object (serialize)


    //todo deal with noSuchElementException
    @PutMapping("/activities/{id}")
    public void update(@RequestBody Activity activity, @PathVariable Integer id) {
        activityService.save(activity);
    }

    @DeleteMapping("/activities/{id}")
    public void delete(@PathVariable Integer id) {
        activityService.delete(id);
    }

}
