package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * BestTimeBuySellStock测试
 * Created by zeyuan on 2020/5/24.
 */
public class BestTimeBuySellStockTest {

    @Test
    public void testMaxProfit(){

        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        int[] params = {7,1,5,3,6,4};
        Assert.assertEquals(bestTimeBuySellStock.maxProfit(params),5);

        int[] newParams = {7,6,4,3,1};
        Assert.assertEquals(bestTimeBuySellStock.maxProfit(newParams),0);

    }
}
