package com.blog.service.Impl;

import com.blog.entities.Post;
import com.blog.payload.CommentDto;
import com.blog.payload.PostDto;
import com.blog.repository.PostRepository;
import com.blog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;

    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = maptoEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto dto = maptoDto(post);
        return dto;
    }

    Post maptoEntity(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
      }

      PostDto maptoDto(Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    }
