package com.test.pojo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    private String name;

    private String race;

    private double weight;

    private boolean alive;

    public enum Sex {
        MALE, FEMALE
    }

    private Sex sex;

}
