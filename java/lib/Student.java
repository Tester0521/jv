
package lib;

import java.util.*;
import lib.Grade;

public class Student {

	public String name;
	private List<Integer> grades;

	public Student(String name, Grade[] arr) {
		this.name = name;
		this.grades = new ArrayList<>();

		for (Grade el : arr) this.grades.add(el.get_val());
	}

	public Student(String name) {
		this.name = name;
		this.grades = new ArrayList<>();
	}

	public Student() {
		this.name = "Anonymous";
		this.grades = new ArrayList<>();
	}




	public void push(Grade n) {
		this.grades.add(n.get_val());
	}

	public void replace(Grade n, int pos) {
		this.grades.set(pos, n.get_val());
	}

	public void fill_grades(Grade[] arr) {
		for (int i = 0; i < arr.length; i++) this.grades.add(arr[i].get_val());
	}


	public int[] get_grades() {
		// int[] res = new int[this.grades.size()];

		// for (int i = 0; i < this.grades.size(); i++) res[i] = this.grades.get(i);
		// return res;
		return this.grades.stream().mapToInt(Integer::intValue).toArray();
	}

	public int get_average() {
		return this.grades.stream().mapToInt(Integer::intValue).sum() / this.grades.size();
	}



	public String isFullSupport() {
		return (get_average() == 5) ? "отличник" : "не отличник";
	}

	public String toString() {
		return "\nStudent: \n\t> " + this.name + "\n\t> " + this.grades.toString() + "\n";
	}
}

