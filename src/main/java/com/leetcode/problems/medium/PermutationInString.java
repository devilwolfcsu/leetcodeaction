package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 567. 字符串的排列 (Permutation in String)
 * [题目]
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 *
 * [示例1]
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 *
 * [示例2]
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 * Created by zeyuan on 2020/4/23.
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

        // 计算s1字符串中的各字符的数量
        Map<Character,Integer> s1Map = new HashMap<Character, Integer>();
        Map<Character,Integer> s2Map = new HashMap<Character, Integer>();
        for(int i=0;i<s1.length();i++){
            Integer count = s1Map.get(s1.charAt(i));
            count = count == null? 1:count+1;
            s1Map.put(s1.charAt(i),count);

            Integer count2 = s2Map.get(s2.charAt(i));
            count2 = count2 ==null?1:count2+1;
            s2Map.put(s2.charAt(i),count2);
        }
        // 比较第一个窗口区间
        if(isEqualsMap(s1Map,s2Map)){
            return true;
        }

        // left  right 为窗口大小， 比较该窗口内的所有元素是否相等，否则后移
        for(int left=1,right=s1.length();right<s2.length();left++,right++){
            s2Map = generateCharMap(s2Map,s2.charAt(left-1),s2.charAt(right));
            if(isEqualsMap(s1Map,s2Map)){
                return true;
            }
        }

        return false;
    }

    private boolean isEqualsMap(Map<Character,Integer> s1Map,Map<Character,Integer> s2Map){
        for(Character s1Key : s1Map.keySet()) {
            // 不相等
            if (s2Map.get(s1Key) == null || !s1Map.get(s1Key).equals(s2Map.get(s1Key))) {
                return false;
            }
        }
        return true;
    }
    /**
     *
     * @param sourceMap  原Map 不为空
     * @param removeChar 要Remove掉的char 该字符肯定是存在的
     * @param insertChar 要新写入的char
     * @return
     */
    private Map<Character,Integer> generateCharMap(Map<Character,Integer> sourceMap,char removeChar,char insertChar){

        Integer removeCount = sourceMap.get(removeChar);
        if(removeCount ==1){
            sourceMap.remove(removeChar);
        }else{
            sourceMap.put(removeChar,--removeCount);
        }

        Integer insertCount = sourceMap.get(insertChar);
        insertCount = insertCount ==null?1:insertCount+1;
        sourceMap.put(insertChar,insertCount);
        return sourceMap;
    }
}
