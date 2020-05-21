package com.leetcode.problems.medium;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 56. 合并区间 Merge Intervals
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 * [示例1]
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * [示例2]
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * Created by zeyuan on 2020/5/14.
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length<=1){
            return intervals;
        }
        // 排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0]<o2[0]){
                    return -1;
                }
                if(o1[0] > o2[0]){
                    return 1;
                }
                return 0;
            }
        });
        int currentStart  = intervals[0][0];
        int currentEnd = intervals[0][1];
        int[][] result = new int[intervals.length][2];
        int index = 0;
        for(int i=0;i<intervals.length;i++){

            int[] currentPoint = intervals[i];
            // 记录一个新的节点
            if(currentEnd<currentPoint[0]){
                int[] item = new int[]{currentStart,currentEnd};
                result[index] = item;
                index++;
                currentStart = currentPoint[0];
                currentEnd = currentPoint[1];
            }else if(currentEnd <currentPoint[1]){
                currentEnd = currentPoint[1];
            }
        }
        int[] item = new int[]{currentStart,currentEnd};
        result[index] = item;
        index++;
        return Arrays.copyOf(result,index);
    }
}
