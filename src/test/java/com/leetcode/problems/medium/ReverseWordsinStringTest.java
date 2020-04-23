package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * ReverseWordsinString 测试
 * Created by zeyuan on 2020/4/23.
 */
public class ReverseWordsinStringTest {

    @Test
    public void testReverseWords(){

        ReverseWordsinString reverseWordsinString = new ReverseWordsinString();
        Assert.assertEquals(reverseWordsinString.reverseWords("the sky is blue"),"blue is sky the");
        Assert.assertEquals(reverseWordsinString.reverseWords("  hello world!  "),"world! hello");
        Assert.assertEquals(reverseWordsinString.reverseWords("a good   example"),"example good a");
        Assert.assertEquals(reverseWordsinString.reverseWords("a"),"a");
    }
}
