package com.blog.service;

import java.util.List;

import com.blog.entity.Comment;

public interface CommentService {

    public List<Comment> findAllBlogList();

    public Comment findBlogById(long id);

    public void save(Comment blog);

    public void edit(Comment blog);

    public void delete(Comment blog);

}
