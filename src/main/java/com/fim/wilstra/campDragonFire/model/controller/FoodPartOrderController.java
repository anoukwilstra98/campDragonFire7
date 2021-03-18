package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodPartOrder;
import com.fim.wilstra.campDragonFire.model.service.FoodPartOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodPartOrders")
public class FoodPartOrderController {

    @Autowired
    FoodPartOrderService foodPartOrderService;

    @GetMapping("/")
    public List<FoodPartOrder> list() {
        return foodPartOrderService.listAll();
    }

}
