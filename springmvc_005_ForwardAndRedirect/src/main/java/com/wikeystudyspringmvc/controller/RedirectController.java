package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-12 00:31
 * @Description:
 */
@Controller
@RequestMapping(value = "redirect/")
public class RedirectController {
    @RequestMapping(value = "d")
    public String toD() {
        return "redirect:/redirect/f";
    }

    @RequestMapping(value = "e")
    public String toE() {
        return "redirect:/redirect/f";
    }

    @RequestMapping(value = "f")
    public String toF() {
        return "f";
    }
}
