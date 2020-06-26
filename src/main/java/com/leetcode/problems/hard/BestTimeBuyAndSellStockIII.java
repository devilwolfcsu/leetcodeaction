package com.leetcode.problems.hard;

/**
 * 123. 买卖股票的最佳时机 III Best Time to Buy and Sell Stock III
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例1
 * 输入: [3,3,5,0,0,3,1,4]
 * 输出: 6
 * 解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 * 随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
 *
 * 示例2
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。  
 * 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。  
 * 因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 *
 * 示例3
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这个情况下, 没有交易完成, 所以最大利润为 0。
 * 状态机解法
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/solution/yi-ge-tong-yong-fang-fa-tuan-mie-6-dao-gu-piao-wen/
 * Created by zeyuan on 2020/6/26.
 */
public class BestTimeBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        /*  如果数组小于2 则直接返回收益为0 */
        if(prices.length<2){
            return 0;
        }
        // 选择一个点 然后计算前半部分最大利润 和后半部分最大利润。 找到找个点 使得 两边相加最大 即可
        int n = prices.length;
        int[] maxProfit1 = new int[n];
        int[] maxProfit2 = new int[n];
        //从前向后计算
        int startPrice = prices[0];
        int maxProfit  = 0;
        maxProfit1[0] =0;
        for(int i=0;i<n;i++){
            if(prices[i]<startPrice){
                startPrice = prices[i];
            }
            if(maxProfit<prices[i]-startPrice){
                maxProfit = prices[i]-startPrice;
            }
            maxProfit1[i] = maxProfit;
        }
        // 最大的卖出价格
        int endPrice = prices[n-1];
        maxProfit = 0;
        for(int i=n-1;i>=0;i--){
            if(prices[i]>endPrice){
                endPrice = prices[i];
            }
            if(maxProfit< endPrice - prices[i]){
                maxProfit = endPrice-prices[i];
            }
            maxProfit2[i] = maxProfit;
        }

        // 3. 计算利润和，求最大值
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, maxProfit1[i] + maxProfit2[i]);
        }

        return result;
    }


}
