package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.blog.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {


}

