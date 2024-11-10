package com.tester0521.prelude;

import java.util.Random;


public abstract class Bird {
	private String name;
	private Sound sound;

	public Bird(String name) {
		this.name = name;
		this.sound = new Sound();
	}

	protected abstract String getSound();

	public void sing() {
		System.out.println(sound.play());
	}


	public static class Sound {
		Random random = new Random();
		public String play() {
			int soundLen = random.nextInt(10) + 1;

			if (soundLength < sound().length()) return sound().substring(0, soundLength);
			else return sound();
		}
	}

	public String sound() {
		
	}
}