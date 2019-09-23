package com.zlj.controller;

import com.alibaba.fastjson.JSON;
import com.zlj.bean.Post;
import com.zlj.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zlj
 * @introduce
 */

@Controller
public class PostHander {

    @Autowired
    PostService postService;

    @RequestMapping("allPost")
    @ResponseBody
    public List<Post>  selectAllPost(){
        List<Post> list =  postService.selectAllPost();
        return list ;

    }

}
