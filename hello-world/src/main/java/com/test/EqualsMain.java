package com.test;

import java.util.Objects;

public class EqualsMain {

    public static void main(String[] args) {
        // tohle je OK: zjistuje se, jestli 100 == 100
        System.out.println(100 == 100); // true

        // takhle NEEEEE!!!!!!
        {
            // tohle neni OK, zjistuje se, jestli "a" i "b" "ukazuji" na stejny objekt
            Integer a = new Integer(100);
            Integer b = new Integer(100);
            System.out.println(a == b); // false
        }
        {
            Integer a = new Integer(100);
            Integer b = a;
            System.out.println(a == b); // true
        }

        // Reseni: TAKHLE ANO!!!
        {
            Integer a = new Integer(100);
            Integer b = new Integer(100);
            System.out.println(a.equals(b)); // true
        }

        // drobky
        {
            Integer a = Integer.valueOf(100);
            Integer b = Integer.valueOf(100);
            System.out.println(a == b); // true, NEPOUZIVAT!!!
            System.out.println(a.equals(b)); // true
            System.out.println(Objects.equals(a, b)); // true
        }
        {
            Integer a = Integer.valueOf(1_000);
            Integer b = Integer.valueOf(1_000);
            System.out.println(a == b); // false, NEPOUZIVAT!!!
            System.out.println(a.equals(b)); // true
            System.out.println(Objects.equals(a, b)); // true
        }

        // porovnavani Stringu
        {
            String s1 = "test";
            String s2 = new String("test");
            System.out.println(s1 == s2); // false, NEPOUZIVAT!!!
            System.out.println(s1.equals(s2)); // true
        }
    }

}
