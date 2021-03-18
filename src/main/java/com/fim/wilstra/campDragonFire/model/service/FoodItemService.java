package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodItem;
import com.fim.wilstra.campDragonFire.model.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> listAll() {
        return (List<FoodItem>) foodItemRepository.findAll();
    }

    public void save(FoodItem foodItem) {
        foodItemRepository.save(foodItem);
    }

    public FoodItem get(Integer id) {
        return foodItemRepository.findById(id).get();
    }

    public void delete(Integer id) {
        foodItemRepository.deleteById(id);
    }

}
