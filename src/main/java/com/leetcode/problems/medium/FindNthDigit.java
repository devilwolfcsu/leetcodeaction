package com.leetcode.problems.medium;

/**
 * 400. 第N个数字  难度 ： 中等
 * [题目]
 *   在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *   n 是正数且在32位整数范围内
 * [示例]
 *   输入: 3
 *   输出: 3
 *
 *
 *   输入: 11
 *   输出: 0
 *   说明： 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 * Created by zeyuan on 2020/4/14.
 */
public class FindNthDigit {

    public int findNthDigit(int n) {

        /*如果n<=9 则直接返回N*/
        if(n<=9){
            return n;
        }
        int charNum = 9;// 累计字符数字
        int intNum = 0; // 整数个数
        int pre_num = 9; // 已有的字符个数
        //int i = 1; //i位数
        for(int i =1;;i++) {
            // 如果N小与等于该位数的最大字符个数
            if (n <= charNum) {
                double tmp_num = n - pre_num;
                int nth_num = (int) Math.ceil(tmp_num / i); //向上取整
                int mod = (int)(tmp_num+(i-1)) % i;
                int num = intNum + nth_num;
                return String.valueOf(num).charAt(mod) - '0';
            }
            // 否则将计算下个区间的最大字符个数
            pre_num = charNum;
            intNum += 9 * (int)Math.pow(10, i-1);
            charNum += 9 * Math.pow(10, i) * (i+1);
        }
    }
}
