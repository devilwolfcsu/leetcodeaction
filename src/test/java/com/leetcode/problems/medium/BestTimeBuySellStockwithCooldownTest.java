package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * BestTimeBuySellStockwithCooldown 测试
 * Created by zeyuan on 2020/7/12.
 */
public class BestTimeBuySellStockwithCooldownTest {

    @Test
    public void testMaxProfit(){

        int[] prices = {1,2,3,0,2};
        BestTimeBuySellStockwithCooldown bestTimeBuySellStockwithCooldown = new BestTimeBuySellStockwithCooldown();

        Assert.assertEquals(bestTimeBuySellStockwithCooldown.maxProfit(prices),3);
    }
}
