package com.blog.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Comment;
import com.blog.service.CommentService;

@RestController
public class CommentController {
	
    @Resource
    CommentService Userservice;
	
    @RequestMapping("/getBlog")
    @Cacheable(value="blog-key")
    public Comment getBlog() {
    	Comment blog=Userservice.findBlogById(Long.valueOf(123456));
    	System.out.println("get from database");
        return blog;
    }
    
    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<Comment> getUsers() {
    	List<Comment> Users=Userservice.findAllBlogList();
    	System.out.println("get from database");
        return Users;
    }
    
    @RequestMapping("/saveUser")
    void saveBlog() {
    	Comment user = new Comment();
    	Userservice.save(user);
    }
}