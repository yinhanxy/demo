package com.example.demo.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class BookProperties {

    @Value("${demo.book.name}")
    private String name;

    @Value("${demo.book.writer}")
    private String writer;
}
