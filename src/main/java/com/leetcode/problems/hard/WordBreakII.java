package com.leetcode.problems.hard;

import java.util.*;

/**
 * 140. 单词拆分 II (Word Break II)
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：
 *   拆分时可以重复使用字典中的单词。
 *   你可以假设字典中没有重复的单词。
 *
 *   示例1
 *   输入:
 *    s = "catsanddog"
 *    wordDict = ["cat", "cats", "and", "sand", "dog"]
 *    输出:
 *    [
 *     "cats and dog",
 *     "cat sand dog"
 *    ]
 *
 *    示例2：
 *    输入:
 *    s = "pineapplepenapple"
 *    wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 *    输出:
 *    [
 *      "pine apple pen apple",
 *      "pineapple pen apple",
 *      "pine applepen apple"
 *    ]
 *   解释: 注意你可以重复使用字典中的单词。
 *
 *   示例3：
 *   输入:
 *   s = "catsandog"
 *   wordDict = ["cats", "dog", "sand", "and", "cat"]
 *   输出:
 *    []
 *
 * Created by zeyuan on 2020/6/30.
 */
public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        LinkedList<String>[] dp = new LinkedList[s.length()+1];
        LinkedList<String> initial = new LinkedList<>();
        initial.add("");
        dp[0] = initial;//初始化空
        //dp[0] =1;//设置0表示可以进行分割
        for(int i=0;i<s.length();i++){

            for(String word:wordDict){
                if(i+1>=word.length()){
                    if(s.substring(i-word.length()+1,i+1).equals(word)){
                        List<String> items  = dp[i-word.length()+1];
                        // 等于空则表示前面不能形成分割
                        if(items==null){
                            continue;
                        }
                        LinkedList<String> list = new LinkedList<>();
                        for(String item :items){
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(item);
                            stringBuilder.append(item.isEmpty()?"":" ");
                            stringBuilder.append(word);
                            list.add(stringBuilder.toString());
                        }
                        if(dp[i+1]==null){
                            dp[i+1] = list;
                        }else{
                            dp[i+1].addAll(list);
                        }
                    }
                }
            }
        }
        return dp[s.length()]==null? new ArrayList<>():dp[s.length()];
    }


    public List<String> wordBreak2(String s, List<String> wordDict) {
        LinkedList<String>[] dp = new LinkedList[s.length() + 1];
        LinkedList<String> initial = new LinkedList<>();
        initial.add("");
        dp[0] = initial;
        for (int i = 1; i <= s.length(); i++) {
            LinkedList<String> list = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                if (dp[j].size() > 0 && wordDict.contains(s.substring(j, i))) {
                    for (String l : dp[j]) {
                        list.add(l + (l.equals("") ? "" : " ") + s.substring(j, i));
                    }
                }
            }
            dp[i] = list;
        }
        return dp[s.length()];
    }
}
