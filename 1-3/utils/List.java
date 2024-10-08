package utils;

import java.util.Arrays;

public class List {
	public int[] arr;
	public int size = 0;

	public List() {}

	public void push(int n) {
		int[] newArr = new int[this.size + 1];

		for (int i = 0; i < this.size; i++) newArr[i] = this.arr[i];

		this.arr = newArr;
		this.arr[this.size++] = n;
	}

	public void replace(int n, int pos) {
		this.arr[pos] = n;
	}

	public int[] items() {
		return this.arr;
	}

	public String toString() {
		return Arrays.toString(this.arr);
	}
}