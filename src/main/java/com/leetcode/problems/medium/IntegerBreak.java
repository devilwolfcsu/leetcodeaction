package com.leetcode.problems.medium;

/**
 *  343. 整数拆分  Integer Break
 *  给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * 示例1
 *  输入: 2
 *  输出: 1
 *  解释: 2 = 1 + 1, 1 × 1 = 1。
 *
 * 示例2
 *   输入: 10
 *   输出: 36
 *   解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * Created by zeyuan on 2020/7/12.
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        if(n <= 3){
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if(b == 0){
            return (int)Math.pow(3, a);
        }
        if(b == 1){
            return (int)Math.pow(3, a - 1) * 4;
        }
        return (int)Math.pow(3, a) * 2;
    }
}
