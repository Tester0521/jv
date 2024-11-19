package com.tester0521.weapon;

public class Gun extends Weapon {

	public Gun(int ammo) {
		super(ammo);
	}

	public void shoot() {
		super.ammo--;
		System.out.println("*");
	}
}
