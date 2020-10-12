package com.test;

import java.math.BigDecimal;

public class DoubleTroubleMain {

    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println("" + 1 + 2);
        System.out.println("" + (1 + 2));

        System.out.println(0.1 + 0.2); // 0.30000000000000004

        // NEBO BigDecimal:

        {
            BigDecimal a = new BigDecimal(0.1);
            BigDecimal b = new BigDecimal(0.2);
            System.out.println(a.add(b));
        }
        {
            BigDecimal a = BigDecimal.valueOf(0.1);
            BigDecimal b = BigDecimal.valueOf(0.2);
            System.out.println(a.add(b));
        }
    }

}
