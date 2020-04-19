package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestValidParentheses 测试
 * Created by zeyuan on 2020/4/19.
 */
public class LongestValidParenthesesTest {


    @Test
    public void testLongestValidParentheses(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();

        Assert.assertEquals(longestValidParentheses.longestValidParentheses("()"),2);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses("(()"),2);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses(")()())"),4);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses(""),0);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses("))(((())))"),8);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses("))(((()))))((((()))))"),10);
        Assert.assertEquals(longestValidParentheses.longestValidParentheses("))((((())))))(((())))"),10);

    }
}
