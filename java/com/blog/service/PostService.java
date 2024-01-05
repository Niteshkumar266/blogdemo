package com.blog.service;

import com.blog.payload.CommentDto;
import com.blog.payload.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    public PostDto createPost(PostDto postDto);



}
