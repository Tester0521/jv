package com.tester0521.animals;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Parrot extends Bird {
    private String text;

    public Parrot(String name){
        super(name);
    }

    public void talk(String text){
        this.text = text;
    }

    public void song(){
        System.out.println(
            IntStream
                .range(0, getSoundDuration().nextInt(10))
                .mapToObj(i -> text + " ")
                .collect(Collectors.joining()) + "..."
        );
        
    }
}
