package com.projects.lombok.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
public class LombokDataDemo {

    private  String name;

    private int age;

    private double salary;

    public static void main(String[] args) {

        LombokDataDemo obj1 = new LombokDataDemo();

        obj1.setName("Kuldeep");

        obj1.setSalary(9000);

        obj1.setAge(30);

        System.out.println(obj1.getName());

        System.out.println(obj1.hashCode());

    }



}
