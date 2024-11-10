

package com.tester0521.deprecated;

public enum Engine {
	V4(4), V6(6), V8(8), V12(12), V16(16);
	private final String name;
	private final int cylinders;
	private int mileage = 0;

	Engine(int c) {
		this.name = "V" + c;
		this.cylinders = c;
	}

	private void working(int v) {
		this.mileage += v;
	}

	private int getCylinders() {
		return this.cylinders;
	}

	private int getMileage() {
		return this.mileage;
	}

	public String toString() {
		return name + "\n" + cylinders + "\n" + mileage;
	}
}

// public class Engine {
// 	private EngineType engineType;
// 	private int engineMileage;

// 	Engine(EngineType engineType) {
// 		this.engineType = engineType;

// 	}
// }


