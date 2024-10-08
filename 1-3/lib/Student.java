
package lib;

import utils.*;

public class Student {

	public String name;
	public List grades;

	public Student(String name) {
		this.name = name;
		this.grades = new List();
	}

	public void push(int n) {
		this.grades.push(n);
	}

	public void replace(int n, int pos) {
		this.grades.replace(n, pos);
	}

	public void fill(int[] arr) {
		for (int i = 0; i < arr.length; i++) this.grades.push(arr[i]);
	}

	public int[] grades() {
		int[] items = grades.items();
		int[] res = new int[items.length];

		for (int i = 0; i < items.length; i++) res[i] = items[i];

		return res;
	}

	public String toString() {
		return "\nStudent: \n\t> " + this.name + "\n\t> " + this.grades.toString() + "\n";
	}
}