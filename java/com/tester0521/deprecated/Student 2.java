package com.tester0521.deprecated;

public class Student {
    private String name;
    private int[] arr;
    private double res;


    public Student(String name, int... arr) {
        this.name = name;
        this.arr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 3 || arr[i] <= 5) this.arr[i] = arr[i];
        }
    }

    public int[] push(int index, int num) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = num;
        this.arr = newArr;

        return arr;
    }

    private String GPA() {
        String status = "";
        this.res = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 3 && arr[i] <= 5) res += arr[i];
            else count++;
        }

        res /= (arr.length - count);

        if (res == 5) status = "Отличник";
        if (res >= 4) status = "Хорошист";
        if (res == 3) status = "Крутой троечник";
        if (res <= 2) status = "Двоечник";

        return status;
    }

    private String getRating() {
        String res = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 10) continue;
            if (i == arr.length - 1) {
                res += " оценка " + arr[i];
                continue;
            }
            res += " оценка " + arr[i] + ",";
        }
        return res;
    }

    public String toString() {
        GPA();
        return name + ": " + " [" + getRating() + " ];" + "\n" + "Средний бaл - " + res + "\n" + GPA();
    }
}