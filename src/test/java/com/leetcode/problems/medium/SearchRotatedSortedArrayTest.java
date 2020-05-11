package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SearchRotatedSortedArray  测试
 * Created by zeyuan on 2020/5/11.
 */
public class SearchRotatedSortedArrayTest {

    @Test
    public void testSearch(){
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        Assert.assertEquals(searchRotatedSortedArray.search(nums,0),4);
        int[] newnums = {4,5,6,7,0,1,2};
        Assert.assertEquals(searchRotatedSortedArray.search(newnums,3),-1);
        int[] nNums  ={6,7,0,1,2};
        Assert.assertEquals(searchRotatedSortedArray.search(nNums,6),0);

        int[] anotherNums = {3,1};
        Assert.assertEquals(searchRotatedSortedArray.search(anotherNums,0),-1);

        int[] othernums ={5,1,3};
        Assert.assertEquals(searchRotatedSortedArray.search(othernums,3),2);

    }
}
