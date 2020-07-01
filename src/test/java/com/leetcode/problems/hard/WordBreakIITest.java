package com.leetcode.problems.hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * WordBreakII 测试
 * Created by zeyuan on 2020/6/30.
 */
public class WordBreakIITest {

    @Test
    public void testWordBreak(){

        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        WordBreakII wordBreakII = new WordBreakII();
        //System.out.println(wordBreakII.wordBreak("catsanddog",wordDict));
        //Assert.assertEquals(wordBreakII.wordBreak("",wordDict),);
        wordDict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println(wordBreakII.wordBreak(s,wordDict));
    }

    @Test
    public void testWordreak2(){

        WordBreakII wordBreakII = new WordBreakII();
        //System.out.println(wordBreakII.wordBreak("catsanddog",wordDict));
        //Assert.assertEquals(wordBreakII.wordBreak("",wordDict),);
        List<String> wordDict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println(wordBreakII.wordBreak2(s,wordDict));
    }
}
