package cc.unitmesh.testng.dto;

import lombok.Data;

@Data
public class CreateBlogRequest {
    private String title;
    private String content;
}