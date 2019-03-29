package com.projects.lombok.constructors;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class RequiredArgsConstructorDemo {

    private final int x, y;
    private int z;

    public static void main(String[] args) {

        RequiredArgsConstructorDemo obj1 = new RequiredArgsConstructorDemo(1, 2);

        System.out.println(obj1);


    }

}
