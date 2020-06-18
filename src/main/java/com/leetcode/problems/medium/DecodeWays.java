package com.leetcode.problems.medium;

/**
 * 91. 解码方法 Decode Ways
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * [示例1]
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 * Created by zeyuan on 2020/6/12.
 */
public class DecodeWays {

    public int numDecodings(String s) {

        if(s==null||s.length()==0||s.charAt(0)=='0'){
            return 0;
        }
        // dp[-1] = dp[0] =1
        int pre = 1,current =1;
        for(int i=1;i<s.length();i++){
            int tmp = current;
            if(s.charAt(i)=='0'){
                if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'){
                    current = pre;
                }else{
                    return 0;
                }
            }else if(s.charAt(i-1)=='1'||(s.charAt(i-1)=='2'&&s.charAt(i)>='1'&&s.charAt(i)<='6')){
                current = current + pre;

            }
            pre = tmp;
        }
        return current;
    }
}
