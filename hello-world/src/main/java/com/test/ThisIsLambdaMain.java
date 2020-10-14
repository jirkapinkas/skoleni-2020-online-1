package com.test;

import com.test.pojo.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThisIsLambdaMain {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                Dog.builder().name("Rex").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Lassie").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Dora").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Bobik").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Alik").sex(Dog.Sex.MALE).build()
        ));

        // vnitrni (anonymni) trida
//        dogs.sort(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog dog1, Dog dog2) {
//                return dog1.getName().compareTo(dog2.getName());
//            }
//        });

        // kdyz interface obsahuje PRAVE JEDNU ABSTRAKTNI METODU,
        // pak se jedna o tzv. Funkcionalni interface
        // a Fun. interface se da alternativne zapsat jako tzv. lambda vyraz
//        dogs.sort((Dog dog1, Dog dog2) -> {
//                return dog1.getName().compareTo(dog2.getName());
//            });

//        dogs.sort((dog1, dog2) -> {
//            return dog1.getName().compareTo(dog2.getName());
//        });

//        dogs.sort((dog1, dog2) -> dog1.getName().compareTo(dog2.getName()));

        dogs.sort(Comparator.comparing(Dog::getName));

//        dogs.forEach(dog -> System.out.println(dog));

        // method reference: pro nejjednodussi lambda vyrazy
        dogs.forEach(System.out::println);
    }

}
