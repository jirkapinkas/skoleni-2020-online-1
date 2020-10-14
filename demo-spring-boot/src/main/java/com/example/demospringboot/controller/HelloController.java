package com.example.demospringboot.controller;

import com.example.demospringboot.pojo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {
//
//    private int counter;

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public Message hello() {
//        counter++;
        return Message.builder()
                .message("Ahoj Svete, Spring Boot funguje ... opravdu!")
                .date(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")))
                .build();
    }
//
//    @GetMapping("/hello2")
//    public Message hello2() {
//        counter--;
//        return Message.builder()
//                .message("Ahoj Svete, Spring Boot funguje ... opravdu!")
//                .date(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")))
//                .build();
//    }
//
//    @GetMapping("/counter")
//    public int counter() {
//        return counter;
//    }
//
}
