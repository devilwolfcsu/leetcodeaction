package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * BestTimeBuyAndSellStockIII 测试
 * Created by zeyuan on 2020/6/26.
 */
public class BestTimeBuyAndSellStockIIITest {

    @Test
    public void testMaxProfit(){

        int[] prices = {3,3,5,0,0,3,1,4};
        BestTimeBuyAndSellStockIII bestTimeBuyAndSellStockIII = new BestTimeBuyAndSellStockIII();
        Assert.assertEquals(bestTimeBuyAndSellStockIII.maxProfit(prices),6);
    }

    @Test
    public void testMaxProfit2(){
        int[] prices = {1,2,3,4,5};
        BestTimeBuyAndSellStockIII bestTimeBuyAndSellStockIII = new BestTimeBuyAndSellStockIII();
        Assert.assertEquals(bestTimeBuyAndSellStockIII.maxProfit(prices),4);
    }

    @Test
    public void testMaxProfit3(){
        int[] prices = {7,6,4,3,1};
        BestTimeBuyAndSellStockIII bestTimeBuyAndSellStockIII = new BestTimeBuyAndSellStockIII();
        Assert.assertEquals(bestTimeBuyAndSellStockIII.maxProfit(prices),0);
    }

    @Test
    public void testMaxProfit4(){
        int[] prices = {1,2,4,2,5,7,2,4,9,0};
        BestTimeBuyAndSellStockIII bestTimeBuyAndSellStockIII = new BestTimeBuyAndSellStockIII();
        Assert.assertEquals(bestTimeBuyAndSellStockIII.maxProfit(prices),13);
    }
}
