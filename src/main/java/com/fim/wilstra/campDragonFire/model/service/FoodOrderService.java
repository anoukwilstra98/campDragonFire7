package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodOrder;
import com.fim.wilstra.campDragonFire.model.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {
    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public List<FoodOrder> listAll() {
        return (List<FoodOrder>) foodOrderRepository.findAll();
    }

    public void save(FoodOrder foodOrder) {
        foodOrderRepository.save(foodOrder);
    }

    public FoodOrder get(Integer id) {
        return foodOrderRepository.findById(id).get();
    }

    public void delete(Integer id) {
        foodOrderRepository.deleteById(id);
    }

}
