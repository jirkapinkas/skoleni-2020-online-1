package com.test;

import com.test.pojo.Lektor;

public class HelloWorldMain {

    public static void main(String[] args) {
        // sout + ENTER
        System.out.println("============");
        System.out.println("Hello World!");
        System.out.println("============");

        Lektor jirka = new Lektor();
        jirka.setJmeno("Jirka Pinkas");
        jirka.setVyska(170);
        jirka.setPocetLetZkusenosti(15);
        // Ctrl + klik = chytrejsi navigace v kodu
        System.out.println(jirka.getClovekTxt());

//        Integer integer = Integer.valueOf(123);
        Integer integer = Integer.valueOf("123");
        int integer2 = Integer.parseInt("123");
    }

}
