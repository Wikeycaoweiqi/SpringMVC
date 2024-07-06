package com.wikeystudyspringmvc.controller;

import com.wikeystudyspringmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-11 01:14
 * @Description:
 */
@Controller
@RequestMapping(value = "getdatabybean/")
public class GetDataByBeanController {
    @RequestMapping(value = "login")
    public String login(User user) {
        System.out.println(user);
        return "login.html";
    }
}
