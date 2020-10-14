package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Item;
import com.example.demospringboot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomItemController {

    @Autowired
    private ItemRepository itemRepository;

    // http://localhost:8080/custom/items
    @GetMapping("/custom/items")
    public List<Item> items() {
        return itemRepository.findAll();
    }

}
