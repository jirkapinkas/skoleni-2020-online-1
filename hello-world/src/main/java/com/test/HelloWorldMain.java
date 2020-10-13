package com.test;

import com.test.pojo.Dog;
import com.test.pojo.Lektor;

import java.util.Arrays;

public class HelloWorldMain {

    public static void main(String[] args) {
        // sout + ENTER
        System.out.println("============");
        System.out.println("Hello World!");
        System.out.println("============");

        Lektor jirka = new Lektor(170, "Jirka Pinkas", 15);
//        jirka.setJmeno("Jirka Pinkas");
//        jirka.setVyska(170);
//        jirka.setPocetLetZkusenosti(15);
        // Ctrl + klik = chytrejsi navigace v kodu
        System.out.println(jirka.getClovekTxt());

//        Integer integer = Integer.valueOf(123);
        Integer integer = Integer.valueOf("123");
        int integer2 = Integer.parseInt("123");

        // pouziti Builder Design Pattern
        Dog dog = Dog.builder()
                .name("Lumpik")
                .sex(Dog.Sex.MALE)
                .alive(true)
                .build();

        Arrays.asList(new int[] {1, 2, 3, 4, 5});
        Arrays.asList(1, 2, 3, 4, 5);
    }

}
