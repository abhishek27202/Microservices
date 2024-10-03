package com.microservices.post.post.controller;

import com.microservices.post.post.Entity.Post;
import com.microservices.post.post.service.PostService;
import com.microservices.post.post.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class postController {
    @Autowired
    private PostService postService;
    public postController(PostServiceImpl postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity<Post> savePost(@RequestBody
    Post post){
       Post newPost= postService.savePost(post);
        return new ResponseEntity<>(newPost , HttpStatus.CREATED);

    }
    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPostByPostId(@PathVariable Long postId){
      Post getpost=  postService.findPostById(postId);
      return new ResponseEntity<>(getpost , HttpStatus.OK);
    }
}
