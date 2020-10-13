package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jirka");
        list.add("Michal");
        list.add("Zoro");
        list.add("Thanos");

        // POZOR!!!!!
//        for (int i = 0; i < list.size(); i++) {
//            String zaznam = list.get(i); // list.get(i) VOLAT POUZE!!! U ArrayListu!!!
//            System.out.println("list[" + i + "] = " + zaznam);
//        }

        for (String zaznam : list) {
            System.out.println(zaznam);
        }
    }

}
