package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * RussianDollEnvelopes 测试
 * Created by zeyuan on 2020/5/31.
 */
public class RussianDollEnvelopesTest {

    @Test
    public void  testMaxEnvelopes() {

        int[][] envelopes = {
                {5, 4},
                {6, 4},
                {6, 7},
                {2, 3}
        };
        RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();
        Assert.assertEquals(russianDollEnvelopes.maxEnvelopes(envelopes), 3);
    }
    @Test

    public void testMaxEnvelopesAnther(){

         int[][] envelopes = {
                 {4,5},
                 {4,6},
                 {6,7},
                 {2,3},
                 {1,1}
        };
        RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();
        Assert.assertEquals(russianDollEnvelopes.maxEnvelopes(envelopes),4);

    }
}
