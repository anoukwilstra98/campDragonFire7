package com.fim.wilstra.campDragonFire.model.repository;

import com.fim.wilstra.campDragonFire.model.javaEntity.CampingSpot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampingSpotRepository extends CrudRepository<CampingSpot, Integer> {
}
