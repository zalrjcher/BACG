package com.zlj.mapper;

import com.zlj.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zlj
 * @introduce
 */

@Component
public interface UserMapper {
    void addUser(User user);
    List<User> selectUname(User user);
}
