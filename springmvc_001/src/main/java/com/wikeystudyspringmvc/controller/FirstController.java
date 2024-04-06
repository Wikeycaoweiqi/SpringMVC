package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-04 22:21
 * @Description:
 */
@Controller
public class FirstController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/first")
    public String first() {
        return "first";
    }
    @RequestMapping(value = "/second")
    public String second() {
        return "second";
    }
}
