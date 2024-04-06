package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-06 19:12
 * @Description:
 */
@Controller
@RequestMapping(value = "testrestful/")
public class TestRestFulController {
    @RequestMapping(value = "login/{username}/{password}")
    public String testRestFul(
            @PathVariable(value = "username") String username,
            @PathVariable(value = "password") String password) {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return "testrestful";
    }
}
