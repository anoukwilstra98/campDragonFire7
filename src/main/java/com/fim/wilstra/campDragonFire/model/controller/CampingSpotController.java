package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.CampingSpot;
import com.fim.wilstra.campDragonFire.model.service.CampingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campingSpots")
public class CampingSpotController {

    @Autowired
    CampingSpotService campingSpotService;

    @GetMapping("/")
    public List<CampingSpot> list() {
        return campingSpotService.listAll();
    }

}
