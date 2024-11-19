package com.tester0521.animals;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Cat implements Meow {
    private String name;
    private int count;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
        this.count = 0;
    }

    public String meow() {
        return IntStream
                .range(0, count)
                .mapToObj(i -> "meow" + (i == count - 1 ? "!" : ", "))
                .collect(Collectors.joining());
    }

    public String toString() {
        ++count;

        return (name == null) ? "Meow" : name + " : " + meow();
    }
}
