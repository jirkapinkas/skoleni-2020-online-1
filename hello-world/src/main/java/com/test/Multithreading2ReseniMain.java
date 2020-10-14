package com.test;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Multithreading2ReseniMain {

    // nejlepsi zpusob reseni problemu se synchronizaci vlaken
    // je pouzit strukturu / tridu, ktera je tzv. "thread safe"
    private static AtomicInteger counter = new AtomicInteger();

    // dalsi zajimave thread safe tridy:
    // AtomicInteger / AtomicBoolean / ...
    // Collections.synchronizedList(new ArrayList<>())
    // ConcurrentHashMap
    // JdbcTemplate
    // DataSource
    // LocalDate, LocalTime, LocalDateTime
    // StringBuffer (StringBuilder NENI thread-safe!!!)
    // kdyz si nejsme jisti, tak do googlu napiseme "is NAZEV_TRIDY thread safe"
    // vsechny immutable objekty jsou thread-safe

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            IntStream.range(0, 1_000_000)
                    .forEach(value -> {
                        counter.incrementAndGet();
                    });
        });

        Thread thread2 = new Thread(() -> {
            IntStream.range(0, 1_000_000)
                    .forEach(value -> {
                        counter.decrementAndGet();
                    });
        });

        // vytvori & spusti vlakno
        thread1.start();
        thread2.start();

        // operace, ktera ceka az dobehne vlakno
        thread1.join();
        thread2.join();

        System.out.println("Counter = " + counter.get());
    }

}
