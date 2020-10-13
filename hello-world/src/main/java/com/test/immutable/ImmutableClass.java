package com.test.immutable;

public class ImmutableClass {

    private String name;

    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // po pridani setteru uz tato trida nebude immutable!!!
//    public void setName(String name) {
//        this.name = name;
//    }
}
