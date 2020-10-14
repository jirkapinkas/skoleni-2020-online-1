package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// http://localhost:8080/items
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
