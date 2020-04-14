package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SmallRangeI 测试
 * Created by zeyuan on 2020/4/14.
 */
public class SmallRangeITest {

    /**
     * 测试
     * A[] = {1} K =0  期望返回 0
     */
    @Test
    public void testSmallestRangeIForOneValue(){

        SmallRangeI smallRangeI = new SmallRangeI();
        int[] A = {1};
        Assert.assertEquals(smallRangeI.smallestRangeI(A,0),0);
    }

    /**
     * 大区间测试
     * A[] = {0,10}, K = 2
     * 期望返回 6
     */
    @Test
    public void testSmallestRangeIForBigRange(){

        SmallRangeI smallRangeI = new SmallRangeI();
        int[] A = {0,10};
        Assert.assertEquals(smallRangeI.smallestRangeI(A,2),6);
    }

    /**
     * 小区间测试
     * A[] ={1,3,6}
     * K = 3
     * 期望返回 6
     */
    @Test
    public void testSmallestRangeIForSmallRange(){
        SmallRangeI smallRangeI = new SmallRangeI();
        int[] A = {1,3,6};
        Assert.assertEquals(smallRangeI.smallestRangeI(A,3),0);
    }
}
