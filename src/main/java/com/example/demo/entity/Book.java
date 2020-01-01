package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "book")
@Data
public class Book {
    private String name;
    private String author;
    private Float price;
    private List<String> readers;
}
