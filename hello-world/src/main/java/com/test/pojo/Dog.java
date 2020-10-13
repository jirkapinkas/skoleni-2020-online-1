package com.test.pojo;

import lombok.*;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.weight, weight) == 0 &&
                alive == dog.alive &&
                Objects.equals(name, dog.name) &&
                Objects.equals(race, dog.race) &&
                sex == dog.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, race, weight, alive, sex);
    }
}
