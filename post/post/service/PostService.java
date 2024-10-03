package com.microservices.post.post.service;

import com.microservices.post.post.Entity.Post;

public interface PostService {
    public Post savePost(Post post);

    public Post findPostById(Long id);
}
