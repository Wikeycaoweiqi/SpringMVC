package com.wikeystudyspringmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-07 00:07
 * @Description:
 */
@Controller
@RequestMapping(value = "requestmappingparams/")
public class RequestMappingParamsController {
    @RequestMapping(value = "testparams", params = {"username", "password"})
    public String testParams(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return "testparams";
    }
}
