package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Login;
import com.fim.wilstra.campDragonFire.model.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    //contains more methods eg listall()

    public List<Login> listAll() {
        return (List<Login>) loginRepository.findAll();
    }

    public void save(Login login) {
        loginRepository.save(login);
    }

    public Login get(Integer id) {
        return loginRepository.findById(id).get();
    }

    public void delete(Integer id) {
        loginRepository.deleteById(id);
    }

}
