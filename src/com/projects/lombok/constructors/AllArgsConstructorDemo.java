package com.projects.lombok.constructors;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AllArgsConstructorDemo {

    private final String name;

    private int age;

    private double salary;

    public static void main(String[] args) {

        AllArgsConstructorDemo obj1 = new AllArgsConstructorDemo("kuldeep", 30, 8000);

        System.out.println(obj1);
    }
}
