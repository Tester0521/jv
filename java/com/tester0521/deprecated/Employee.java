package com.tester0521.deprecated;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    public Department department;
    List<String> list = new ArrayList<>();

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        if (department.chief != null && name.equals(department.chief.name))
            return name + " начальник отдела " + department.name;

        return name + " работает в отделе " + department.name + ", начальник которого " + department.chief.name;
    }
}