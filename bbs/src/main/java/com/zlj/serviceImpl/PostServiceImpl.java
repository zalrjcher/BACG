package com.zlj.serviceImpl;

import com.zlj.bean.Post;
import com.zlj.mapper.PostMapper;
import com.zlj.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zlj
 * @introduce
 */
@Service("postService")
public class PostServiceImpl  implements PostService {
    @Autowired
    PostMapper postMapper ;
    @Override
    public List<Post> selectAllPost() {
        List<Post> list =  postMapper.selectAllPost();
        return list;
    }
}
