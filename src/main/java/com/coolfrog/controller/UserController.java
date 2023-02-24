package com.coolfrog.controller;

import com.coolfrog.annotation.LoginUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String save() {
        System.out.println("spring is running");
        return "Spring is running";
    }

    @RequestMapping("/postwithtoken")
    public String postWithToken(@LoginUser Integer uid) {
        if (uid == null) {
            System.out.println("no token");
            return "no token";
        }
        System.out.println("get uid " + uid);
        return uid.toString();
    }
}
