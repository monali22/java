package com.projects.lombok.constructors;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class NoArgsConstructorDemo {

    private int x, y, z;

    public static void main(String[] args) {

        NoArgsConstructorDemo obj1 = new NoArgsConstructorDemo();

        System.out.println(obj1);

    }

}
