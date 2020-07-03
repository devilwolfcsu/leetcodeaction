package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DungeonGame 测试
 * Created by zeyuan on 2020/7/3.
 */
public class DungeonGameTest {

    @Test
    public void testCalculateMinimumHP() {
        DungeonGame dungeonGame = new DungeonGame();

        int[][] dungeon = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}};
        Assert.assertEquals(dungeonGame.calculateMinimumHP(dungeon), 7);
    }

    @Test
    public void testCalculateMinimumHP2() {
        DungeonGame dungeonGame = new DungeonGame();

        int[][] dungeon = {
                {1,-3,3},{0,-2,0},{-3,-3,-3}};
        Assert.assertEquals(dungeonGame.calculateMinimumHP(dungeon), 3);
    }
}
