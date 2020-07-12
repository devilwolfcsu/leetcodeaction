package com.leetcode.problems.medium;

/**
 * 322. 零钱兑换  Coin Change
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 示例1
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * 示例2
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 * Created by zeyuan on 2020/7/12.
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        if(coins==null||coins.length==0||amount==0){
            return -1;
        }

        return 0;
    }

}
