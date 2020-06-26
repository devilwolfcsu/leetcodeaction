package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**BestTimeBuySellStockII 测试
 * Created by zeyuan on 2020/5/24.
 */
public class BestTimeBuySellStockIITest {

    @Test
    public void maxProfit(){

        BestTimeBuySellStockII bestTimeBuySellStockII = new BestTimeBuySellStockII();
        int[] stocks = {7,1,5,3,6,4};
        Assert.assertEquals(bestTimeBuySellStockII.maxProfit(stocks),7);

        int[] newStocks ={1,2,3,4,5};
        Assert.assertEquals(bestTimeBuySellStockII.maxProfit(newStocks),4);

        int[] otherStocks ={7,6,4,3,1};
        Assert.assertEquals(bestTimeBuySellStockII.maxProfit(otherStocks),0);

    }

    @Test
    public void maxProfit1(){

        BestTimeBuySellStockII bestTimeBuySellStockII = new BestTimeBuySellStockII();
        int[] otherStocks ={1,2,4,2,5,7,2,4,9,0};
        Assert.assertEquals(bestTimeBuySellStockII.maxProfit(otherStocks),15);
    }
}
