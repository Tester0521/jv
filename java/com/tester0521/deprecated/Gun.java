package com.tester0521.deprecated;

public class Gun {
	private int maxBullets;
	int currentBullets;

	public Gun(int bullet) {
		if (bullet < 0) {
			throw new IllegalArgumentException("Введите корректное число патрон, вместимых в магазин!");
		}
		this.maxBullets = bullet;
		this.currentBullets = bullet;
	}

	public int getMaxBullets() {
		return this.maxBullets;
	}

	public void reload() {
		currentBullets = maxBullets;
	}

	public void discharge() {
		currentBullets = 0;
	}

	public int getCurrentBullets() {
		return currentBullets;
	}

	private void shot() {
		if (currentBullets > 0) {
			currentBullets--;
		}
	}

	public String toString() {
		if (currentBullets > 0) {
			shot();
			return "Бах!";
		}
		return "Клац!";
	}
}
