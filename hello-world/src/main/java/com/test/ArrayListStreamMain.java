package com.test;

import com.test.pojo.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStreamMain {

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                Dog.builder().name("Alik").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Rex").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Lassie").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Dora").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Bobik").sex(Dog.Sex.MALE).build()
        );
        // imperativni zpusob programovani
        List<String> dogNames1 = new ArrayList<>();
        for (Dog dog : dogs) {
            if(dog.getSex() == Dog.Sex.MALE && dog.isAlive()) {
                String name = dog.getName();
                dogNames1.add(name);
            }
        }
        System.out.println(dogNames1);

        // deklarativni zpusob programovani
        List<String> dogNames2 = dogs.stream()
                .filter(dog -> dog.getSex() == Dog.Sex.MALE)
                .filter(Dog::isAlive)
                .map(Dog::getName)
                .collect(Collectors.toList());
        System.out.println(dogNames2);
    }

}
