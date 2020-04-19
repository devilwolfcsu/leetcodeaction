package com.leetcode.problems.hard;

/**
 * 32. 最长有效括号 (Longest Valid Parentheses)
 * 动态规划  困难
 * [题目]
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * [示例1]
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 *
 * [示例2]
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * Created by zeyuan on 2020/4/17.
 */
public class LongestValidParentheses {


    public int longestValidParentheses(String s) {

        // 初始化状态数组，用于记录信息状态
        // -1 代表压入栈的是 '('
        // -2 代表压入栈的是')'
        // 0 代表该位置的元素已经出栈
        // 大于0 代表以该未知结束的子串的有效括号字符数
        int[] status = new int[s.length()];
        int maxValidNums = 0; // 最大有效括号字符数
        int currentSubNums = 0; // 当前子串内有效括号字符数
        // 遍历字符串
        for(int i=0;i<s.length();i++){

            // 遇到'('直接入栈
            if(s.charAt(i) =='('){
                status[i] = -1;
                continue;
            }
            // 遇到 ')'尝试向前找'('出栈
            if(s.charAt(i)==')'){
                // 向前反向找第一个-1
                int currentStart = i;
                for(int j = i-1;j>=0;j--){
                    if(status[j]==-1){
                        status[j] = 0; // 将该位置 （ 置为已出栈
                        currentStart = j;
                        break;
                    }
                    if(status[j]==-2){ // 如果是压入了 一个 ) 则直接跳出
                        break;
                    }
                }
                //
                if(currentStart == i){
                    status[i] = -2; // 压栈 -2
                    continue;
                }
                // 该区间中是否有别的自增序列
                //有跨越区间
                // 判断currentStart 前面数字是否大于0
                // 若为最前面的 则 直接返回区间
                if(currentStart==0){
                    currentSubNums = i-currentStart+1;
                    status[i] = currentSubNums;
                    if(currentSubNums > maxValidNums){
                        maxValidNums = currentSubNums;
                    }
                    continue;
                }
                if(status[currentStart-1]>0){
                    currentSubNums = i-currentStart + status[currentStart-1]+1;
                    status[i] = currentSubNums;
                    if(currentSubNums>maxValidNums){
                        maxValidNums = currentSubNums;
                    }
                    continue;
                }else{
                    currentSubNums = i-currentStart+1;
                    status[i] = currentSubNums;
                    if(currentSubNums > maxValidNums){
                        maxValidNums = currentSubNums;
                    }
                    continue;
                }
            }
        }

        return maxValidNums;
    }
}
