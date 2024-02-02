package org.example;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int age;
    private LocalDate birthday;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}

