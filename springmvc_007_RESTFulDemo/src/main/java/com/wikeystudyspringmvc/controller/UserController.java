package com.wikeystudyspringmvc.controller;

import com.wikeystudyspringmvc.bean.User;
import com.wikeystudyspringmvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: wikey
 * @create: 2024-06-30 00:09
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userlist(Model model) {
        List<User> userList = userDao.getAllUser();
        model.addAttribute("users", userList);
        return "user_list";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String save(User user) {
        userDao.saveUser(user);
        return "redirect:/user";
    }
}