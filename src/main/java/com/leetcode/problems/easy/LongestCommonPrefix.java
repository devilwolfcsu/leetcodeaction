package com.leetcode.problems.easy;

/**
 * 14.最长公共前缀 （Longest Common Prefix）
 * [题目]
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * [示例1]
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * [示例2]
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * Created by zeyuan on 2020/4/20.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        int minStrLength = strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(minStrLength>strs[i].length()){

                minStrLength = strs[i].length();
            }
        }
        // 便利最小长度的字符串
        StringBuilder result = new StringBuilder();
        for(int i=0;i<minStrLength;i++){
            char currentChar = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                char tempChar = strs[j].charAt(i);
                if(tempChar!=currentChar){
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
