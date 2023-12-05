package cc.unitmesh.testng.controller;

import cc.unitmesh.testng.dto.CreateBlogRequest;
import cc.unitmesh.testng.dto.CreateBlogResponse;
import cc.unitmesh.testng.entity.BlogPost;
import cc.unitmesh.testng.service.BlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/{id}")
    public BlogPost getBlog(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }

    @PostMapping("/")
    public BlogPost createBlog(@RequestBody CreateBlogRequest request) {
        CreateBlogResponse response = new CreateBlogResponse();
        BlogPost blogPost = new BlogPost();
        BeanUtils.copyProperties(request, blogPost);
        BlogPost createdBlog = blogService.createBlog(blogPost);
        BeanUtils.copyProperties(createdBlog, response);
        return createdBlog;
    }
}