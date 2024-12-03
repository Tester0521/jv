package com.tester0521.other;

public class Name {
	private final String name;
	private final String surname;

	public Name(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() 	{ return name; }
	public String getSurname()  { return surname; }

	@Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Name other) ) return false;

        return Objects.equals(name, other.name) &&
               Objects.equals(surname, other.surname);
    }

	@Override public int hashCode() {
        return Objects.hash(name, surname);
    }
}