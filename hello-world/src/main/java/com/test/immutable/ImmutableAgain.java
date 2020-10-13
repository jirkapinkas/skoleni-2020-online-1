package com.test.immutable;

import java.util.Arrays;

public final class ImmutableAgain {

    private final String[] strings;

    public ImmutableAgain(String[] strings) {
        this.strings = Arrays.copyOf(strings, strings.length);
    }

    public String[] getStrings() {
        return Arrays.copyOf(strings, strings.length);
    }

    @Override
    public String toString() {
        return "NotImmutable{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        ImmutableAgain xxx = new ImmutableAgain(strings);
        strings[0] = "x";
        xxx.getStrings()[0] = "y";
        System.out.println(xxx);
    }
}
