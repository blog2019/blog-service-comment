package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findById (long id);
    
    public Comment save(Comment blog);
}