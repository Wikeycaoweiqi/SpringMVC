package com.wikeystudyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author: wikey
 * @create: 2024-04-14 09:36
 * @Description:
 */
@Controller
public class UserController {
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getAllUser() {
        return "getallusers";
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable(value = "id") String id) {
        System.out.println(id);
        return "getuserbyid";
    }
}
