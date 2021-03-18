package com.fim.wilstra.campDragonFire.model.repository;

import com.fim.wilstra.campDragonFire.model.javaEntity.FoodOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends CrudRepository<FoodOrder, Integer> {
}
