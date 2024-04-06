package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-05 00:10
 * @Description:
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "first")
    public String first() {
        return "first";
    }
}
