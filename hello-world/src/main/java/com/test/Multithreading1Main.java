package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading1Main {

    public static void main(String[] args) {
        // pool vlaken, kde je 200 vlaken
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            while(true) {
                System.out.println("Vlakno A bezi ..." + Thread.currentThread().getName());
                Thread.sleep(100);
            }
        });
        executorService.submit(() -> {
            while(true) {
                System.out.println("Vlakno B bezi ..." + Thread.currentThread().getName());
                Thread.sleep(100);
            }
        });
    }

}
