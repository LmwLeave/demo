package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {
//    Article article;
    private ArticleService articleService;
    @GetMapping("/article")
    public List<Article> article() {
//        return article.toString();
        return articleService.list();
    }
}
