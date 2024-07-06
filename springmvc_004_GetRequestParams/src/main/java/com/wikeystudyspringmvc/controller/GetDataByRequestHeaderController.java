package com.wikeystudyspringmvc.controller;

import com.wikeystudyspringmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wikey
 * @create: 2024-04-11 01:19
 * @Description:
 */
@Controller
@RequestMapping(value = "getdatabyrequestheader/")
public class GetDataByRequestHeaderController {
    @RequestMapping(value = "login")
    public String login(@RequestHeader(value = "referer") String referer,
                        @RequestHeader(value = "User-Agent") String userAgent,
                        User user) {
        System.out.println(user);
        System.out.println(referer);
        System.out.println(userAgent);
        return "login.html";
    }
}
