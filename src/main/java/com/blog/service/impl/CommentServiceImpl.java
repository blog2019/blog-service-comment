package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Comment;
import com.blog.repository.CommentRepository;
import com.blog.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAllBlogList() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findBlogById(long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void save(Comment blog) {
    	commentRepository.save(blog);
    }

    @Override
    public void edit(Comment blog) {
    	commentRepository.save(blog);
    }

    @Override
    public void delete(Comment blog) {
    	commentRepository.delete(blog);
    }
}


