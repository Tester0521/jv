package com.tester0521.animals;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Kyky extends Bird {

    public Kyky(String name){
        super(name);
    }

    public void song(){
        System.out.print(
            IntStream
                .range(0, getSoundDuration().nextInt(10))
                .mapToObj(i -> "Ky-ky ")
                .collect(Collectors.joining())
        );
    }
}
