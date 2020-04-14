package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. 整数转罗马数字（Integer to Roman）
 * [题目]
 *  罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 *   字符          数值
 *    I             1
 *    V             5
 *    X             10
 *    L             50
 *    C             100
 *    D             500
 *    M             1000
 *  例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *  通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 *  所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 *    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *    给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内
 *  [示例1]
 *  输入: 3
 *  输出: "III"
 *  [示例2]
 *  输入: 4
 *  输出: "IV"
 *  [示例3]
 *  输入: 9
 *  输出: "IX"
 *  [示例4]
 *  输入: 58
 *  输出: "LVIII"
 *  解释: L = 50, V = 5, III = 3.
 *  [示例5]
 *  输入: 1994
 *  输出: "MCMXCIV"
 *  解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * Created by zeyuan on 2020/4/14.
 */
public class IntegerToRoman {

    private static final  Map<Integer,String> intToRomanMap;

    static{
        intToRomanMap  =  new HashMap<Integer, String>();
        intToRomanMap.put(1,"I");
        intToRomanMap.put(5,"V");
        intToRomanMap.put(10,"X");
        intToRomanMap.put(50,"L");
        intToRomanMap.put(100,"C");
        intToRomanMap.put(500,"D");
        intToRomanMap.put(1000,"M");

        intToRomanMap.put(4,"IV");
        intToRomanMap.put(9,"IX");
        intToRomanMap.put(40,"XL");
        intToRomanMap.put(90,"XC");
        intToRomanMap.put(400,"CD");
        intToRomanMap.put(900,"CM");
    }

    public String intToRoman(int num){

        StringBuilder result = new StringBuilder();
        int div = num/1000;// 千位上的数字
        result.append(toRoman(div*1000,div,1000));
        div = (num%1000)/100;//百位数
        result.append(toRoman(div*100,div,100));
        div = (num%100)/10;//十位数字
        result.append(toRoman(div*10,div,10));
        div = num%10; //个位数字
        result.append(toRoman(div,div,1));
        return result.toString();
    }

    /** */
    private  String toRoman(int num,int div,int figures){

        if(div==0){
            return "";
        }
        // 刚好有该值对应的字符
        if(intToRomanMap.get(num)!=null){
            return intToRomanMap.get(num);
        }
        StringBuilder result = new StringBuilder();
        if(div > 5){
            result.append(intToRomanMap.get(5*figures));
            div -=5;
        }

        for(int i=0;i<div;i++){
            result.append(intToRomanMap.get(figures));
        }
        return result.toString();
    }
}
