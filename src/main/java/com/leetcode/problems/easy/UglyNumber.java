package com.leetcode.problems.easy;

/**
 * 263. 丑数 Ugly Number
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例1
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 *
 * 示例2
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 *
 * 示例3
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 *
 * Created by zeyuan on 2020/7/3.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        if(num ==1 || num==2||num==3||num==4||num==5||num==6||num==8||num==9||num==10){
            return true;
        }
        while(num>1 &&(num%2==0||num%3==0||num%5==0)){
            if(num%2==0){
                num/=2;
            }
            if(num%3==0){
                num/=3;
            }
            if(num%5==0){
                num/=5;
            }
        }
        return num==1;
    }
}
