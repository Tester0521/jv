

import java.io.*;
import java.lang.*;
import java.util.Arrays;


public class Dz1 {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println(Arrays.toString(arr));


		arr = push(arr, 9);

		System.out.println(Arrays.toString(arr));


		arr = addTo(arr, 0, -1);

		System.out.println(Arrays.toString(arr));


		arr = addTo(arr, 5, 92);

		System.out.println(Arrays.toString(arr));
	}


	public static int[] push(int[] arr, int n) {

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < newArr.length; i++) 
			if (i < arr.length) newArr[i] = arr[i]; 
			else newArr[i] = n;

		return newArr;
	}

	public static int[] addTo(int[] arr, int to, int n) {

		int[] newArr = new int[arr.length + 1];
		int i = 0;

		for (int el : arr) if (i++ != to) newArr[i] = el;
		newArr[to] = n;

		return newArr;
	}

}


