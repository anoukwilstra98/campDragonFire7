package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Activity;
import com.fim.wilstra.campDragonFire.model.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    //contains more methods eg listall()

    public List<Activity> listAll(){
        return (List<Activity>) activityRepository.findAll();
    }

    public void save(Activity activity){
        activityRepository.save(activity);
    }

    public Activity get(Integer id){
        return activityRepository.findById(id).get();
    }

    public void delete(Integer id){
        activityRepository.deleteById(id);
    }


}
