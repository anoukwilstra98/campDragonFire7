package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.Activity;
import com.fim.wilstra.campDragonFire.model.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    //http requests use getmapping + location
    @GetMapping("/")
    public List<Activity> list() {
        return activityService.listAll();
    }


    //todo deal with  noSuchElementException
    @GetMapping("/{id}")
    public Object get(@PathVariable Integer id) {

        try {
            return activityService.get(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return null;
        }

    }

    @PostMapping("/")
    public void add(@RequestBody Activity activity) {
        activityService.save(activity);
    }

    //todo deal with noSuchElementException
    @PutMapping("/{id}")
    public void update(@RequestBody Activity activity, @PathVariable Integer id) {
        activityService.save(activity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        activityService.delete(id);
    }

}
