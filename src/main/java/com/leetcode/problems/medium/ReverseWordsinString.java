package com.leetcode.problems.medium;

/**
 * 151. 翻转字符串里的单词 （Reverse Words in a String）
 * [题目]
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * [示例1]
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 *
 * [示例2]
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * [示例3]
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * Created by zeyuan on 2020/4/22.
 */
public class ReverseWordsinString {

    public String reverseWords(String s) {
        String[] splits = s.split(" ");
        if(splits.length==0){
            return "";
        }
        if(splits.length==1){
            return splits[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(splits[splits.length-1]);
        for (int i = splits.length - 2; i >= 0; i--) {
            if(splits[i].equals("")){
                continue;
            }
            stringBuilder.append(" ");
            stringBuilder.append(splits[i]);
        }
        return stringBuilder.toString();
    }
}
