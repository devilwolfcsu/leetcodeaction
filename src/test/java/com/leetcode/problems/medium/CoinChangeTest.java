package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * CoinChange 测试
 * Created by zeyuan on 2020/7/12.
 */
public class CoinChangeTest {

    @Test
    public void testCoinChange(){

        int[] coins = {1, 2, 5};
        CoinChange coinChange = new CoinChange();
        Assert.assertEquals(coinChange.coinChange(coins,11),3);
    }

    /**
     * 不可兑换的场景下
     */
    @Test
    public void testCoinChangeNotUse(){
        int[] coins = {2};
        CoinChange coinChange = new CoinChange();
        Assert.assertEquals(coinChange.coinChange(coins,3),-1);

    }
}
