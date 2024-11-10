package com.tester0521.deprecated;

import lib.Engine;
import lib.Tuning;
import java.util.*;

public class Car extends Tuning {
	private final String name;
	private final int maxCapacity;
	private int capacity = 0;
	private int mileage = 0;
	private double expense;
	private Engine engine;
	private List<Engine> supportedEngines = new ArrayList<>();
	private List<Tuning> tuning = new ArrayList<>();


	public Car(String name, int maxCapacity, Engine engine, Engine... supportedEngines) {
		this.name = name;
		this.engine = engine;
		this.maxCapacity = maxCapacity;
		this.supportedEngines.add(engine);
		this.expense = engine.getCylinders() * 1.2;
		for (Engine el:supportedEngines) this.supportedEngines.add(el);
	}

	public Car(String name, int maxCapacity, Engine engine) {
		this(name, maxCapacity, engine, engine);
	}

	public void move(int km) {
		 
	}

	public String toString() {
		return name + "\n" + maxCapacity + "\n" + capacity + "\n" + expense + "\n" + mileage + "\n" + engine.toString();
	}
}