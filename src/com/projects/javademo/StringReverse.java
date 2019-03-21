package com.projects.javademo;

public class StringReverse {
    public String reverseName(String name){
        String reverse_name="";
        for (int i=name.length()-1;i>=0;i--){
            reverse_name = reverse_name + name.charAt(i);
        }
        return reverse_name;
    }
}
