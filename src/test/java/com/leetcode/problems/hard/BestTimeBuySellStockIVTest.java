package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * BestTimeBuySellStockIV 测试
 * Created by zeyuan on 2020/7/3.
 */
public class BestTimeBuySellStockIVTest {

    @Test
    public void testMaxProfit(){
        BestTimeBuySellStockIV  bestTimeBuySellStockIV = new BestTimeBuySellStockIV();

        int[] prices = {2,4,1};
        Assert.assertEquals(bestTimeBuySellStockIV.maxProfit(2,prices),2);

        int[] pricesnew ={1,2};
        Assert.assertEquals(bestTimeBuySellStockIV.maxProfit(1,pricesnew),1);

        int[] prices3={3,2,6,5,0,3};
        Assert.assertEquals(bestTimeBuySellStockIV.maxProfit(2,prices3),7);


    }


}
