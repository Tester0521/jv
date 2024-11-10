package com.tester0521.deprecated;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee chief;

    public void setChief(Employee chief) {
        this.chief = chief;
        chief.department = this;
    }
}