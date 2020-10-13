package com.test;

import com.test.pojo.Dog;

import java.time.LocalDate;
import java.util.Date;

public class PolymorfizmusMain {

    public static void main(String[] args) {
        Dog dog = Dog.builder()
                .name("Lassie")
                .sex(Dog.Sex.FEMALE)
                .race("Border Kolie")
                .alive(true)
                .build();
        System.out.println(dog/*.toString()*/);
        System.out.println("Pohlavi psa: " + dog.getSex().getName());

        Date date = new Date(); // POZOR! STARY ZPUSOB PRACE S DATUMEM A CASEM!!!
        int currentYearDeprecated = date.getYear();

        int currentYear = LocalDate.now().getYear();

        LocalDate monthStart = LocalDate.now()
                .withDayOfMonth(1);
        LocalDate monthEnd = LocalDate.now()
                .withDayOfMonth(1)
                .plusMonths(1)
                .minusDays(1);
        System.out.println("current month: " + monthStart + " - " + monthEnd);

    }
}
