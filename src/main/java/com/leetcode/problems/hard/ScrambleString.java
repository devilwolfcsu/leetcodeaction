package com.leetcode.problems.hard;

/**
 *  87. 扰乱字符串 Scramble String
 *  给定一个字符串 s1，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。
 *  下图是字符串 s1 = "great" 的一种可能的表示形式。
 *  在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。
 *  例如，如果我们挑选非叶节点 "gr" ，交换它的两个子节点，将会产生扰乱字符串 "rgeat" 。
 *  我们将 "rgeat” 称作 "great" 的一个扰乱字符串。
 *  同样地，如果我们继续交换节点 "eat" 和 "at" 的子节点，将会产生另一个新的扰乱字符串 "rgtae" 。
 *  我们将 "rgtae” 称作 "great" 的一个扰乱字符串。
 *  给出两个长度相等的字符串 s1 和 s2，判断 s2 是否是 s1 的扰乱字符串。
 *
 *  示例1
 *  输入: s1 = "great", s2 = "rgeat"
 *  输出: true
 *
 *  示例2
 *  输入: s1 = "abcde", s2 = "caebd"
 *  输出: false
 *
 * Created by zeyuan on 2020/6/26.
 */
public class ScrambleString {

    public boolean isScramble(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==0){
            return true;
        }
        boolean[][][] dp = new boolean[s1.length()][s2.length()][s1.length()+1];
        int n = s1.length();
        //对切片 len == 1 进行预处理
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j][1] = s1.charAt(i)==s2.charAt(j);
            }
        }
        for(int len = 2;len<=n;len++){
            for(int i=0;i<n-len+1;i++){
                for(int j=0;j<n-len+1;j++){
                    for(int k=1;k<len;k++){
                        //分别i和j开头， 长度为Len 的字符串，任意切片K， 片段是否存在K使得两边相等
                        if(dp[i][j][k]&&dp[i+k][j+k][len-k]){
                            dp[i][j][len]=true;
                            break;
                        }
                        // i 和 j+len-k 开头
                        if(dp[i][j+len-k][k]&&dp[i+k][j][len-k]){
                            dp[i][j][len ]=true;
                            break;
                        }
                    }
                }
            }
        }
        return dp[0][0][n];
    }

}
