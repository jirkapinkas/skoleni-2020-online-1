package com.test.immutable;

import java.util.Arrays;

public class NotImmutable {

    private String[] strings;

    public NotImmutable(String[] strings) {
        this.strings = strings;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return "NotImmutable{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        NotImmutable xxx = new NotImmutable(strings);
        strings[0] = "x";
        System.out.println(xxx);
    }
}
