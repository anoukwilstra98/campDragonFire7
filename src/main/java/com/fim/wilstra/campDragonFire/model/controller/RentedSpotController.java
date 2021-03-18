package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.RentedSpot;
import com.fim.wilstra.campDragonFire.model.service.RentedSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rentedSpots")
public class RentedSpotController {

    @Autowired
    RentedSpotService rentedSpotService;

    @GetMapping("/")
    public List<RentedSpot> list() {
        return rentedSpotService.listAll();
    }
}
