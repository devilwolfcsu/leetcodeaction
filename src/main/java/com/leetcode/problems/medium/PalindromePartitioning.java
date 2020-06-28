package com.leetcode.problems.medium;

import java.util.*;

/**
 *  131. 分割回文串 ( Palindrome Partitioning )
 *  给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 *  返回 s 所有可能的分割方案。
 *
 *  示例1
 *  输入: "aab"
 *  输出:
 *   [
 *    ["aa","b"],
 *    ["a","a","b"]
 *   ]
 * Created by zeyuan on 2020/6/26.
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {

        if(s==null||s.length()==0){
            return null;
        }
        int[][] dp = constructDp(s);
        //遍历dp,返回所有的组合
        Deque<String> stack = new ArrayDeque<>();
        List<List<String>> result = new ArrayList<List<String>>();
        doPartition(s,dp,0,s.length(),stack,result);
        return result;
    }

    private void doPartition(String s,int[][] dp,int start,int len,Deque<String> stack,List<List<String>> result){

        if(start == len){
            result.add(new ArrayList<String>(stack));
            return ;
        }

        for(int i=start;i<len;i++){
            if(dp[start][i]==0){
                continue;
            }
            stack.addLast(s.substring(start,i+1));
            doPartition(s,dp,i+1,len,stack,result);
            stack.removeLast();
        }
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
