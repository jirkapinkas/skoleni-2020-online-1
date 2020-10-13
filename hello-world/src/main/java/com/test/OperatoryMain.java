package com.test;

import com.test.pojo.Blecha;
import com.test.pojo.Clovek;
import com.test.pojo.Dog;
import com.test.pojo.Zvire;

public class OperatoryMain {

    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println(i);
        i+=10;
        System.out.println(i);

        System.out.println("hodnota i = " + i);

        String string = String.valueOf(i);
        System.out.println(string);

        String pes = String.valueOf(Dog.builder().name("Pes").build());

        long cislo = (long) Integer.MAX_VALUE + (long) Integer.MAX_VALUE;
        long result = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(cislo);
//        System.out.println((int) cislo);

        Zvire zvire = /*new Blecha(0);*/ new Clovek(170, "Jirka");
        ((Clovek)zvire).getJmeno();
    }

}
