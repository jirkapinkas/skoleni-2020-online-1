package com.test;

import com.test.pojo.Dog;

import java.util.*;

// interface je jakoby uplne nejvic abstraktni trida,
// ktera ma pouze abstraktni metody a nema stav,
// ma maximalne pouze konstanty
// DULEZITA VEC: Od Java 8 rozdil mezi interfacem a abstraktni tridou je,
// ze interface nemuze mit stav!!!
interface I1 {
    /*public static final*/ String NAME = "I1";
    /*public abstract*/ void test();
    default void test2() { // od Java 8

    }
    static void test3() { // od Java 8

    }
}

class I1Impl implements I1 {

    @Override
    public void test() {

    }
}

class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        int result = dog1.getSex().compareTo(dog2.getSex());
        if(result == 0) {
            result = dog1.getName().compareTo(dog2.getName());
        }
        return result;
    }
}

public class InterfaceMain {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                Dog.builder().name("Rex").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Lassie").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Dora").sex(Dog.Sex.FEMALE).build(),
                Dog.builder().name("Bobik").sex(Dog.Sex.MALE).build(),
                Dog.builder().name("Alik").sex(Dog.Sex.MALE).build()
        ));
        // Collections.sort(dogs, comparator); toto se pouzivalo do Java 8

        dogs.sort(new DogComparator());
        dogs.forEach(System.out::println);
    }
}
