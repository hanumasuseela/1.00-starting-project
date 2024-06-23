package com.luv2code.suseela.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DemoUnitsTest {

     @Test
     public void testEqualsandNotEquals(){
         DemoUtils demoUtils = new DemoUtils();

         assertEquals("2+4 must be 6",6,demoUtils.add(2,4));
         assertNotEquals("2+4 must not be 7",7,demoUtils.add(2,4));
     }
}
