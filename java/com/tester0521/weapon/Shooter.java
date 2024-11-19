package com.tester0521.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public Shooter(String name){
        this(name, null);
    }

    public void setGun(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fire() {
        if (weapon != null) weapon.shoot();
        else System.out.println("No gun!");
    }
}
