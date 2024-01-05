package com.blog.payload;

import lombok.Data;

import java.util.List;

@Data
public class CommentDto {
        private Long id;
        private String name;
        private String email;
        private String body;
        private List<CommentDto> comments;

}
