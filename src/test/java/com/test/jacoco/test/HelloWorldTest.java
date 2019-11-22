package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }

    @Test
    public void testMethod3() {
    	/*
    	  TODO：finish the test function
    	 */
        HelloWorld hw = new HelloWorld();
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, -1};
        int[] c = new int[]{1, -1, -3};
        for (int i : a) {
            for (int j : b) {
                for (int k : c) {
                    int res = hw.Method3(i, j, k);
                }
            }
        }
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int[] inputs = {0, 1, 5};
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    for (int l = 0; l < 3; l++) {
                        try {
                            int res = hw.Method4(inputs[i], inputs[j], inputs[k], inputs[l], 1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

    }

    @Test
    public void testBug() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        boolean b = hw.bug(4);
    }

    @Test
    public void testTriangle() {
        HelloWorld hw = new HelloWorld();
        int[] edge = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    hw.isTriangle(edge[i], edge[j], edge[k]);
    }

    @Test
    public void testBirthday() {
        HelloWorld hw = new HelloWorld();
        int[] years = new int[]{1989, 1990, 1996, 2000, 2019, 2020};
        int[] months = new int[]{0, 1, 10, 12, 13};
        int[] days = new int[]{0, 28, 29, 30, 31, 32};
        for (int year: years)
            for (int month: months)
                for (int day: days)
                    hw.isBirthday(year, month, day);
    }

    @Test
    public void testCalculator() {
        HelloWorld hw = new HelloWorld();
        char[] ops = {'+', '-', '*', '/', '.'};
        double[] nums = {0.0, 1.0, 2.0};
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                for (char op: ops)
                    hw.miniCalculator(nums[i], nums[j], op);
            }
    }
}
