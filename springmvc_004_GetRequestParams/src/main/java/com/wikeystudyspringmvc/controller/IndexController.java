package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-08 01:48
 * @Description:
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
    @RequestMapping
    public String index() {
        return "index";
    }
}
