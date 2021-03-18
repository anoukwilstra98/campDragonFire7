package com.fim.wilstra.campDragonFire.model.repository;

import com.fim.wilstra.campDragonFire.model.javaEntity.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Integer> {
}
