package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: wikey
 * @create: 2024-04-06 19:38
 * @Description:
 */
@Controller
@RequestMapping(value = "requestmethod/")
public class RequestMappingMethodController {
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String requestMethod() {
        System.out.println("requestMethod...");
        return "requestmethod";
    }
}