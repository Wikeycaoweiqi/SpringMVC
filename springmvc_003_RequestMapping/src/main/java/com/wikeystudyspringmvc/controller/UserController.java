package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-05 00:36
 * @Description:
 */
@Controller
public class UserController {
    @RequestMapping(value = "user/detail")
    public String detail() {
        return "user";
    }
}
