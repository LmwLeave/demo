package com.example.demo.knowledge;

import com.example.demo.entity.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args){
        ArrayList<Article> data = new ArrayList<Article>();
        for (int i = 0; i < 12; i++) {
            Article article = new Article();
            article.setTitle(i + "title");
            article.setAuthor(i + "author");
            article.setContent(i + "content");
            article.setReadCount(i%7);
            data.add(article);
        }
        data.sort((a, b) -> b.getTitle().compareTo(a.getTitle()));
        System.out.println(data);
        Set<String> existTitles = data.stream().map(Article::getTitle).collect(Collectors.toSet());
        Article one = data.stream().filter(item -> "1title".equals(item.getTitle())&& item.getAuthor().equals("1author")).findFirst().get();
        System.out.println(existTitles);
        System.out.println(one.toString());
        data.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
        System.out.println(data);
        data.stream().filter(item -> item.getTitle().startsWith("1")).sorted((a,b) -> a.getReadCount().compareTo(b.getReadCount())).forEach(System.out::println);

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .map(String::toUpperCase)
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }

}
