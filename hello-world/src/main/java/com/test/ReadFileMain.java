package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileMain {

    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("pom.xml"));
        for (String string : strings) {
            System.out.println(string);
        }

        // try-with-resources
//        try(Stream<String> stream = Files.lines(Paths.get("pom.xml"))) {
//            stream.forEach(System.out::println);
//        }
    }

}
