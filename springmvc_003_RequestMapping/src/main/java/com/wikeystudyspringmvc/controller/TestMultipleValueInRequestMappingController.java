package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-06 18:56
 * @Description:
 */
@Controller
@RequestMapping("testmultiplevalue/")
public class TestMultipleValueInRequestMappingController {
    @RequestMapping(value = {"testone", "testtwo"})
    public String testMultipleValue (){
        return "testmultiplevalue";
    }
}
