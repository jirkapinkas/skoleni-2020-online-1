package com.test;

import com.test.pojo.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStreamMain {

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                Dog.builder().name("Alik").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Rex").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Lassie").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Dora").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Bobik").sex(Dog.Sex.MALE).build()
        );
//        for (Dog dog : dogs) {
//            if(dog.getSex() == Dog.Sex.MALE) {
//                System.out.println(dog.getName());
//            }
//        }
        dogs.stream()
                .filter(dog -> dog.getSex() == Dog.Sex.MALE)
                .map(Dog::getName)
                .forEach(System.out::println);
    }

}
