package com.wikeystudyspringmvc.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: wikey
 * @create: 2024-07-06 16:17
 * @Description:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/showmsg", method = RequestMethod.GET)
    public void showmsg(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("hello ajax, my name is springmvc!");
    }

}