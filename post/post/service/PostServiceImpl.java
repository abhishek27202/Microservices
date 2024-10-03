package com.microservices.post.post.service;

import com.microservices.post.post.Entity.Post;
import com.microservices.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public Post savePost(Post post) {
    Post savedPost=postRepository.save(post);
    return savedPost;
    }

    @Override
    public Post findPostById(Long postId) {
     Post post= postRepository.findById(postId).get();
     return post;
    }


}
