package com.example.demos.resource;

import com.example.demos.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @GetMapping("/user")
    public User getUser()
    {

        User u1=new User("xyz","poo");
        return u1;
    }

}
