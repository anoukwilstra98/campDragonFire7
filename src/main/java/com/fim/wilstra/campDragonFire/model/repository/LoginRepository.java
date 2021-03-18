package com.fim.wilstra.campDragonFire.model.repository;

import com.fim.wilstra.campDragonFire.model.javaEntity.Login;
import com.fim.wilstra.campDragonFire.model.service.LoginService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
}
