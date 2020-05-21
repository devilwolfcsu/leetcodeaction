package com.leetcode.problems.medium;

import org.testng.annotations.Test;

/**
 * MergeIntervals 测试
 * Created by zeyuan on 2020/5/21.
 */
public class MergeIntervalsTest {

    @Test
    public void testMerge(){

        MergeIntervals mergeIntervals = new MergeIntervals();
        //[[1,3],[2,6],[8,10],[15,18]]
        int[][] params = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeIntervals.merge(params);
        for(int i=0;i<result.length;i++){
            System.out.println("[ "+result[i][0]+","+result[i][1]+" ]");
        }
    }
}
