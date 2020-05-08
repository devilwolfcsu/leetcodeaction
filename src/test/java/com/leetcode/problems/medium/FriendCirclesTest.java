package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * FriendCircles 测试
 * Created by zeyuan on 2020/5/8.
 */
public class FriendCirclesTest {

    @Test
    public void testFindCircleNum(){
        int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
        FriendCircles friendCircles = new FriendCircles();
        Assert.assertEquals(friendCircles.findCircleNum(M),1);

        int[][] Mnew  ={{1,1,0},{1,1,0},{0,0,1}};
        Assert.assertEquals(friendCircles.findCircleNum(Mnew),2);

        //[[1,1,1],[1,1,1],[1,1,1]]

        int[][] MAgain ={{1,1,1},{1,1,1},{1,1,1}};
        Assert.assertEquals(friendCircles.findCircleNum(MAgain),1);
    }
}
