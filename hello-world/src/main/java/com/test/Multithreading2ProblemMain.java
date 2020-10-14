package com.test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Multithreading2ProblemMain {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            IntStream.range(0, 1_000_000)
                    .forEach(value -> {
                        counter++;
                    });
        });

        Thread thread2 = new Thread(() -> {
            IntStream.range(0, 1_000_000)
                    .forEach(value -> {
                        counter--;
                    });
        });

        // vytvori & spusti vlakno
        thread1.start();
        thread2.start();

        // operace, ktera ceka az dobehne vlakno
        thread1.join();
        thread2.join();

        System.out.println("Counter = " + counter);
    }

}
