package com.zlj.mapper;

import com.zlj.bean.User;
import org.springframework.stereotype.Component;

/**
 * @author zlj
 * @introduce
 */

@Component
public interface UserMapper {
    void addUser(User user);
}
