package com.leetcode.problems.easy;

/**
 * 1137. 第 N 个泰波那契数 （N-th Tribonacci Number）
 * [题目]
 * 泰波那契序列 Tn 定义如下： 
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * [示例1]
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * [示例2]
 * 输入：n = 25
 * 输出：1389537
 * Created by zeyuan on 2020/4/16.
 */
public class nthTribonacciNumber {

    /**
     *  f(n) = f(n-1)+f(n-2)+f(n-3)
     */
    public int tribonacci(int n) {

        if(n<2){
            return n;
        }
        if(n==2){
            return 1;
        }
        int  nMinusOne = 1; // n-1
        int  nMinusTwo = 1; // n-2
        int  nMinusThree = 0; // n-3
        int  result = 0;
        for(int i=2;i<n;i++){
            result = nMinusOne + nMinusTwo + nMinusThree;
            nMinusThree = nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = result;
        }

        return result;
    }
}
