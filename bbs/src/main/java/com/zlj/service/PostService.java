package com.zlj.service;

import com.zlj.bean.Post;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zlj
 * @introduce
 */


public interface PostService {
    List<Post> selectAllPost();
}
