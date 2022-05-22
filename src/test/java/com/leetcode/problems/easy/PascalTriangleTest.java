package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by zeyuan on 2022/5/19.
 */
public class PascalTriangleTest {

    /**
     *杨辉三角 测试
     */
    @Test
    public void testPascalTriangle(){

        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(1));
        System.out.println(pascalTriangle.generate(5));

        //Assert.assertEquals(pascalTriangle.generate(),4);
        //Assert.assertEquals(nthTribonacciNumber.tribonacci(25),1389537);
    }
}
