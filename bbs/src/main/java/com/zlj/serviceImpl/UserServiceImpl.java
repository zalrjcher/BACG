package com.zlj.serviceImpl;

import com.zlj.bean.User;
import com.zlj.mapper.UserMapper;
import com.zlj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zlj
 * @introduce
 */

@Service("userService")
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
