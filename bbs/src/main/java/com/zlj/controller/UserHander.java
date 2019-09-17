package com.zlj.controller;

import com.zlj.bean.User;
import com.zlj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zlj
 * @introduce
 */

@Controller
public class UserHander {
    @Autowired
    private  UserService userService;
    @RequestMapping("addUser")
    @ResponseBody
    public  void addUser( User user){
        System.out.println(user);
        userService.addUser(user);
    }
}
