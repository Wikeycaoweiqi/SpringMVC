package com.wikeystudyspringmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: wikey
 * @create: 2024-04-11 00:40
 * @Description:
 */
@Controller
@RequestMapping(value = "getdatabyrequestparam/")
public class GetDataByRequestParamController {
    /*原生Servlet API获取前端参数*/
    @RequestMapping(value = "loginone")
    public String loginOne(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        return "login";
    }

    /*@RequestParam获取前端参数*/
    @RequestMapping(value = "logintwo")
    public String loginTwo(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    ) {
        System.out.println(username);
        System.out.println(password);
        return "login";
    }
}
