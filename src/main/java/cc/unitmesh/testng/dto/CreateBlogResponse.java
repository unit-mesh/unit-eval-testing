package cc.unitmesh.testng.dto;

import lombok.Data;

@Data
public class CreateBlogResponse {
    private Long id;
    private String title;
    private String content;
}