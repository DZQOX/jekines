package com.dzq.jenkines.test;


import com.dzq.jenkines.MyClass1;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyClass1Test {
    @Test
    public void addOneTest(){
        MyClass1 class1 = new MyClass1();
        assertEquals(class1.addOne(1), 2);
    }
}
