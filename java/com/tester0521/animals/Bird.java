package com.tester0521.animals;

import java.util.Random;

public abstract class Bird implements Sound {
    private final String name;
    private Random soundDuration;

    public Bird(String name){
        this.name = name;
        this.soundDuration = new Random();
    }

    public Random getSoundDuration(){
        return soundDuration;
    }

    public boolean fly(){
        return true;
    }

    public abstract void song();
}