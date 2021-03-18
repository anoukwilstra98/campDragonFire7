package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.Renter;
import com.fim.wilstra.campDragonFire.model.service.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/renters")
public class RenterController {

    @Autowired
    RenterService renterService;

    @GetMapping("/")
    public List<Renter> list() {
        return renterService.listAll();
    }

}