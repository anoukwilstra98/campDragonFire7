package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodPartOrder;
import com.fim.wilstra.campDragonFire.model.repository.FoodPartOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodPartOrderService {
    @Autowired
    private FoodPartOrderRepository foodPartOrderRepository;

    public List<FoodPartOrder> listAll() {
        return (List<FoodPartOrder>) foodPartOrderRepository.findAll();
    }

    public void save(FoodPartOrder foodPartOrder) {
        foodPartOrderRepository.save(foodPartOrder);
    }

    public FoodPartOrder get(Integer id) {
        return foodPartOrderRepository.findById(id).get();
    }

    public void delete(Integer id) {
        foodPartOrderRepository.deleteById(id);
    }

}
