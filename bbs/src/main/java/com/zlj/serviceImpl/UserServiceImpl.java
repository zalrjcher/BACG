package com.zlj.serviceImpl;

import com.zlj.bean.User;
import com.zlj.mapper.UserMapper;
import com.zlj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int selectUname(User user) {
        List<User> u = userMapper.selectUname(user);
        if(u.size()==0){
            return  1 ;
        }
       return 0 ;
    }
}
