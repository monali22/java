package com.projects.javademo;

import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {

    @Test
    public void test1(){
        String name = "Kuldeep";
        StringReverse str1= new StringReverse();
        Assert.assertEquals("peedluK",str1.reverseName(name));

    }
}
