package com.leetcode.problems.hard;

/**
 *  97. 交错字符串 Interleaving String
 *  给定三个字符串 s1, s2, s3, 验证 s3 是否是由 s1 和 s2 交错组成的。
 *
 *  示例1：
 *  输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 *  输出: true
 *
 *  示例2：
 *  输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 *  输出: false
 *
 * Created by zeyuan on 2020/6/25.
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {

        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        // 代表空字符串匹配空字符串
        dp[0][0] =1;

        for(int i=0;i<=m;i++){

            for(int j=0;j<=n;j++){
                if(i==0&&j==0){
                    dp[i][j] =1;
                }else if(i==0){
                    // 第一行
                    if(s2.charAt(j-1)==s3.charAt(j-1)&&dp[i][j-1]==1){
                        dp[i][j]=1;
                    }
                }else if(j==0){
                    // 处理第一列
                    if(s1.charAt(i-1)==s3.charAt(i-1)&&dp[i-1][j]==1){
                        dp[i][j]=1;
                    }
                }else{
                    //内部判断
                    if(s1.charAt(i-1)==s3.charAt(i+j-1)&&dp[i-1][j]==1){
                        dp[i][j]=1;
                    }else if(s2.charAt(j-1)==s3.charAt(i+j-1)&&dp[i][j-1]==1){
                        dp[i][j]=1;
                    }
                }
            }
        }

        return dp[m][n] ==1;
    }
}
