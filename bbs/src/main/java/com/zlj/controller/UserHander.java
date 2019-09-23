package com.zlj.controller;

import com.zlj.bean.User;
import com.zlj.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author zlj
 * @introduce
 */

@Controller
@SessionAttributes("user")
public class UserHander {
    private static final Logger logger = LoggerFactory.getLogger("UserHander");
    @Autowired
    private  UserService userService;
    @RequestMapping("/addUser")
    @ResponseBody
    public  int addUser(  User user){
        if ( user != null){
            int result = userService.selectUname(user);
            if (result==0){
                return 0;
            }else{
                String password = DigestUtils.md5Hex(user.getPwd());
                user.setPwd(password);
                userService.addUser(user);
                logger.debug(user+"注册成功");
            }
            return 1;
        }
        return -1;
    }
    @RequestMapping("LogIn")
    @ResponseBody
    public void longIn(User user, ModelMap modelMap){
        int result = userService.selectUname(user);
        modelMap.put("user",user);
        for ( String str:modelMap.keySet()){
            System.out.println(modelMap.get(str).toString());
        }
    }
    @RequestMapping("check")
    @ResponseBody
    public int checkIsLogIn(HttpSession session){
        if(session.getAttribute("user") != null){
            return 1;
        }
        return 0 ;
    }
}
