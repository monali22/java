package com.projects.lombok.constructors;

public class NoArgsPlain {

    private int x, y;

    public NoArgsPlain() {

    }

    public String toString() {

        return "x = " + x + " y = " + y;
    }

    public static void main(String[] args) {

        NoArgsPlain obj1 = new NoArgsPlain();

        System.out.println(obj1);

    }
}
