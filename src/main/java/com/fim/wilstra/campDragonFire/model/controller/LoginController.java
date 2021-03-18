package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.Login;
import com.fim.wilstra.campDragonFire.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/logins")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/logins")
    public List<Login> list() {
        return loginService.listAll();
    }

    //todo deal with  noSuchElementException
    @GetMapping("/{id}")
    public Login get(@PathVariable Integer id) {
        return loginService.get(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Login login) {
        loginService.save(login);
    }

    //todo deal with noSuchElementException
    @PutMapping("/{id}")
    public void update(@RequestBody Login login, @PathVariable Integer id) {
        loginService.save(login);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        loginService.delete(id);
    }


}
