package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-12 00:14
 * @Description:
 */
@Controller
@RequestMapping(value = "forward/")
public class ForwardController {
    @RequestMapping(value = "a")
    public String toA() {
        return "forward:/forward/c";
    }

    @RequestMapping(value = "b")
    public String toB() {
        return "forward:/forward/c";
    }

    @RequestMapping(value = "c")
    public String toC() {
        return "c";
    }
}
