package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestSubstringWithoutRepeatingCharacters 测试
 * Created by zeyuan on 2020/4/20.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring(){

        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters
                = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"),3);
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcdbb"),4);
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"),1);
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"),3);
    }
}
