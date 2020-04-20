package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 3.  无重复字符的最长子串 (Longest Substring Without Repeating Characters)
 *  中等
 *
 * [题目]
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * Created by zeyuan on 2020/4/20.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        // 空字符串或只有一个字符的字符串直接返回字符串长度
        if(s.length()<2){
            return s.length();
        }
        // Map Key 为字符，Value为该字符出现的最靠后的位置序列
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        int maxNum = 0;
        // i 为子串的开头字符，j-1 为子串的最后一个字符，判断是否需要扩充j字符
        for(int i=0, j=0;j<s.length();j++){
            //已经出现了
            if(charMap.containsKey(s.charAt(j))){
                i = Math.max(charMap.get(s.charAt(j))+1,i);
            }
            int currentMaxNum = j-i+1;
            maxNum = Math.max(maxNum,currentMaxNum);
            charMap.put(s.charAt(j),j);
        }
        return maxNum;
    }
}
