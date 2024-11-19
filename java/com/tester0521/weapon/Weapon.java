package com.tester0521.weapon;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new IllegalArgumentException();

        this.ammo = ammo;
    }

    public void breakAmmo() {
        this.ammo = 0;
    }

    public void load(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public abstract void shoot();
}
