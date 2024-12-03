package com.tester0521.other;

public final class NameGenerator {
	private static final NameGenerator q = new NameGenerator();

	private NameGenerator() {};

	public static NameGenerator getInstance() { return q; }

	public Name yieldFullName(String name, String surname)  { return new Name(name, surname); }
	public Name yieldNameOnly(String name) 					{ return new Name(name, null);    }
	public Name yieldSurnameOnly(String surname) 			{ return new Name(null, surname); }
}

