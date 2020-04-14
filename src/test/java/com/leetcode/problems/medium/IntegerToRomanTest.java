package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * IntegerToRoman 测试类
 * Created by zeyuan on 2020/4/14.
 */
public class IntegerToRomanTest {

    /**
     * 测试单数字输出
     */
    @Test
    public void testIntToRomanSimpleInt(){

        IntegerToRoman integerToRoman = new IntegerToRoman();
        String result = integerToRoman.intToRoman(3);
        Assert.assertEquals(result,"III");

        result = integerToRoman.intToRoman(4);
        Assert.assertEquals(result,"IV");
        result = integerToRoman.intToRoman(8);
        Assert.assertEquals(result,"VIII");

        result = integerToRoman.intToRoman(9);
        Assert.assertEquals(result,"IX");
    }

    /**
     * 测试十位数字
     */
    @Test
    public void testIntToRomanDecade(){


        IntegerToRoman integerToRoman = new IntegerToRoman();
        String result = integerToRoman.intToRoman(10);
        Assert.assertEquals(result,"X");

        result = integerToRoman.intToRoman(11);
        Assert.assertEquals(result,"XI");

        result = integerToRoman.intToRoman(58);
        Assert.assertEquals(result,"LVIII");
        result = integerToRoman.intToRoman(90);
        Assert.assertEquals(result,"XC");

        result = integerToRoman.intToRoman(40);
        Assert.assertEquals(result,"XL");

        result = integerToRoman.intToRoman(50);
        Assert.assertEquals(result,"L");
    }

    /**
     * 测试百位数
     */
    @Test
    public void testIntToRomanHundred(){

        IntegerToRoman integerToRoman = new IntegerToRoman();
        String result = integerToRoman.intToRoman(100);
        Assert.assertEquals(result, "C");

        result = integerToRoman.intToRoman(500);
        Assert.assertEquals(result, "D");

        result = integerToRoman.intToRoman(400);
        Assert.assertEquals(result, "CD");

        result = integerToRoman.intToRoman(900);
        Assert.assertEquals(result, "CM");

        result = integerToRoman.intToRoman(520);
        Assert.assertEquals(result, "DXX");

    }

    /**
     *  测试千位数
     */
    @Test
    public void testIntToRomanThousand() {

        IntegerToRoman integerToRoman = new IntegerToRoman();
        String result = integerToRoman.intToRoman(1000);
        Assert.assertEquals(result, "M");

        result = integerToRoman.intToRoman(1994);
        Assert.assertEquals(result, "MCMXCIV");

        result = integerToRoman.intToRoman(1314);
        Assert.assertEquals(result, "MCCCXIV");

    }
}
