package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * WordBreak 测试
 * Created by zeyuan on 2020/6/30.
 */
public class WordBreakTest {

    @Test
    public void testWordBreak(){
        List<String> wordDict = Arrays.asList("leet","code");
        WordBreak wordBreak = new WordBreak();
        Assert.assertEquals(wordBreak.wordBreak("leetcode",wordDict),true);

        wordDict = Arrays.asList("apple","pen");
        Assert.assertEquals(wordBreak.wordBreak("applepenapple",wordDict),true);


        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        Assert.assertEquals(wordBreak.wordBreak("catsandog",wordDict),false);

        wordDict = Arrays.asList("aaaa", "aaa");
        Assert.assertEquals(wordBreak.wordBreak("aaaaaaa",wordDict),true);
    }
}
