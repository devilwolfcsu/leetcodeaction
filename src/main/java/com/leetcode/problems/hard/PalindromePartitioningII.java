package com.leetcode.problems.hard;

import java.util.*;

/**
 * 132. 分割回文串 II Palindrome Partitioning II
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * 返回符合要求的最少分割次数。
 *
 * 示例1
 *  输入: "aab"
 *  输出: 1
 *  解释: 进行一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
 * Created by zeyuan on 2020/6/26.
 */
public class PalindromePartitioningII {

    public int minCut(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[][] dp = constructDp(s);
        // minCut[i] 表示字符串 s[0,i] 的最小分割数
        //
        int[] minCut = new int[s.length()];
        Arrays.fill(minCut,s.length());
        for(int i=0;i<s.length();i++){
            // 如果该字符串为回文，则直接分割次数为0
            if(dp[0][i]==1){
                minCut[i] =0;
            }
            // 从头寻找分割点
            for(int j=0;j<i;j++){
                // s[j+1,i)为回文的话 则 j 为分割点，此时该字符串可以从j点分割，mincut[i] = minCut[j] +1 次分割
                if(dp[j+1][i]==1){
                    minCut[i] = Math.min(minCut[i],minCut[j]+1);
                }
            }
        }
        return minCut[s.length()-1];
    }
    // 构造DP数组
    // dp[i][j] 代表 字符串 从i到j 是否为回文字符串

    int[][] constructDp(String s){
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<=j;i++){
                if(i==j){
                    dp[i][j]=1;
                    continue;
                }
                if(s.charAt(i)==s.charAt(j) ){
                    if(i+1==j || dp[i+1][j-1]==1){
                        dp[i][j] = 1;
                    }
                    continue;
                }
            }
        }
        return dp;
    }
}
