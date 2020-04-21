package com.leetcode.problems.medium;

/**
 * 43. 字符串相乘（Multiply Strings）
 * [题目]
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 *
 * [示例1]
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * [示例2]
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 *
 * 说明：
 * 1. num1 和 num2 的长度小于110。
 * 2. num1 和 num2 只包含数字 0-9。
 * 3. num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 4. 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理
 * Created by zeyuan on 2020/4/20.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        // 如果有为空的字符串则直接返回0字符串
        if(num1==null||num2==null){
            return "0";
        }
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        // 竖式计算 优化方式
        int[] result = new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int tmp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = result[i+j+1] + tmp;
                result[i+j+1] = sum%10;
                result[i+j] += sum/10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while(i<result.length&&result[i]==0){
            i++; // 找到第一个不为0的数字
        }
        for(;i<result.length;i++){
            stringBuilder.append(result[i]);
        }
        return stringBuilder.toString();
    }
}
