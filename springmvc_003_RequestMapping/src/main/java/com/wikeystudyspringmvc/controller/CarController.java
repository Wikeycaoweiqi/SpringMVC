package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-05 00:42
 * @Description:
 */
@Controller
@RequestMapping(value = "car/")
public class CarController {
    @RequestMapping(value = "detail")
    public String detail() {
        return "car";
    }
}
