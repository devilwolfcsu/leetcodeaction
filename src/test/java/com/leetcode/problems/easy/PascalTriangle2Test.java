package com.leetcode.problems.easy;

import org.testng.annotations.Test;

/**
 * Created by zeyuan on 2022/5/19.
 */
public class PascalTriangle2Test {


    @Test
    public void testPascalTriangle(){

        PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
        System.out.println(pascalTriangle2.getRow(0));
        System.out.println(pascalTriangle2.getRow(3));
        System.out.println(pascalTriangle2.getRow(1));

        //Assert.assertEquals(pascalTriangle.generate(),4);
        //Assert.assertEquals(nthTribonacciNumber.tribonacci(25),1389537);
    }
}
