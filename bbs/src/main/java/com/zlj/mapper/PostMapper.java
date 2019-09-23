package com.zlj.mapper;

import com.zlj.bean.Post;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zlj
 * @introduce
 */

@Component
public interface PostMapper {
    List<Post> selectAllPost();
}
