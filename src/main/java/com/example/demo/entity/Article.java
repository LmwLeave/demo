package com.example.demo.entity;

import lombok.Data;

//@Component
//@ConfigurationProperties(prefix = "article")
@Data
public class Article {
    private String title;
    private String author;
    private String content;
    private Integer readCount;
//    private List<String> readers;
}
