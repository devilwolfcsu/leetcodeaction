package com.leetcode.problems.hard;

import java.util.Arrays;

/**
 * 115. 不同的子序列  Distinct Subsequences
 *
 * 给定一个字符串 S 和一个字符串 T，计算在 S 的子序列中 T 出现的个数。
 * 一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰
 * 剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列，而 "AEC" 不是）
 * 题目数据保证答案符合 32 位带符号整数范围。
 *
 * Created by zeyuan on 2020/6/20.
 */
public class DistinctSubsequences {

    public int numDistinct(String s, String t) {

        if(s.length()==0&&t.length()!=0){
            return 0;
        }
        if(s.length()!=0&&t.length()==0){
            return 1;
        }
        int sLenght = s.length();
        int tLenght = t.length();
        int[][] dp  = new int[tLenght+1][sLenght+1];
        // 0 行全部赋值 1
        Arrays.fill(dp[0],1);

        for(int i=1;i<t.length()+1;i++){

            for(int j=1;j<s.length()+1;j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
