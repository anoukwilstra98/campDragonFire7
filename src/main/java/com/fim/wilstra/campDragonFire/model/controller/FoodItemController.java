package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodOrder;
import com.fim.wilstra.campDragonFire.model.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodItems")
public class FoodItemController {
    @Autowired
    FoodOrderService foodOrderService;

    @GetMapping("/")
    public List<FoodOrder> list() {
        return foodOrderService.listAll();
    }

}
