package com.zikan.springactivity.Controller;

import com.zikan.springactivity.Repo.UserRepo;
import com.zikan.springactivity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

//    inject Repository

    @Autowired
    private UserRepo userRepo;


    @GetMapping("/")
    public String getPage(){
        return "Class Activity";
    }

    @GetMapping("/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }

    @PostMapping("/save")
    public  String saveUser (User user){
        userRepo.save(user);

        return "saved..";

    }
}
