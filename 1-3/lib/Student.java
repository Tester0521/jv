
package lib;

import utils.*;

public class Student {

	public String name;
	public List grades;

	public Student(String name) {
		this.name = name;
		this.grades = new List();
	}

	public int push(int n) {
		this.grades.push(n);

		return 0;
	}

	public int replace(int n, int pos) {
		this.grades.replace(n, pos);

		return 0;
	}

	public int fill(int[] arr) {
		for (int i = 0; i < arr.length; i++) this.grades.push(arr[i]);

		return 0;
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