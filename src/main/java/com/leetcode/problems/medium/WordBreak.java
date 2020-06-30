package com.leetcode.problems.medium;

import java.util.List;

/**
 * 139. 单词拆分 (Word Break)
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：
 *   拆分时可以重复使用字典中的单词。
 *   你可以假设字典中没有重复的单词。
 *
 * 示例1：
 *   输入: s = "leetcode", wordDict = ["leet", "code"]
 *   输出: true
 *   解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 *
 * 示例2：
 *   输入: s = "applepenapple", wordDict = ["apple", "pen"]
 *   输出: true
 *   解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *       注意你可以重复使用字典中的单词。
 * 示例3：
 *   输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 *   输出: false
 * Created by zeyuan on 2020/6/30.
 */
public class WordBreak {

    // 动态规划
    // dp[i]  s(0.i) 字符串可以用字典组成
    // dp[i] == dp[i-word.length()] && s(i-word.length(),i+1) equals( word)
    public boolean wordBreak(String s, List<String> wordDict) {

       int[] dp = new int[s.length()+1];
       dp[0] =1;//设置0表示可以进行分割
       for(int i=0;i<s.length();i++){

           for(String word:wordDict){
               if(i+1>=word.length()){
                   if(s.substring(i-word.length()+1,i+1).equals(word)&&dp[i-word.length()+1]==1){
                       dp[i+1] =1;
                   }
               }
           }
       }
       return dp[s.length()]==1;
    }
}
