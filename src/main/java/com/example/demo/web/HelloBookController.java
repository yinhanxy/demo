package com.example.demo.web;

import com.example.demo.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, " + bookProperties.getWriter() +
                " is writing " + bookProperties.getName()+" !";
    }
}
