package com.leetcode.problems.hard;

import java.util.Arrays;

/**
 * 85. 最大矩形 Maximal Rectangle  动态规划
 * 给定一个仅包含 0 和 1 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 *
 * [示例]
 * 输入:
 * [
 *  ["1","0","1","0","0"],
 *  ["1","0","1","1","1"],
 *  ["1","1","1","1","1"],
 *  ["1","0","0","1","0"]
 * ]
 * 输出: 6
 * Created by zeyuan on 2020/6/9.
 */
public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {

        if(matrix==null||matrix.length==0){
            return 0;
        }

        int maxArea = 0;
        int column = matrix[0].length;
        int[] left = new int[column];
        int[] right = new int[column];
        int[] height = new int[column];
        Arrays.fill(right,column);
        for(int i=0;i<matrix.length;i++){
            int currentLeft = 0;
            int currentRight = column;
            for(int j=0;j<column;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else{
                    height[j]=0;
                }
            }
            for(int j=0;j<column;j++){
                if(matrix[i][j]=='1'){
                    left[j] = Math.max(left[j],currentLeft);
                }else{
                    left[j] = 0;
                    currentLeft = j+1;
                }
            }

            for(int j=column-1;j>=0;j--){
                if(matrix[i][j]=='1'){
                    right[j]=Math.min(right[j],currentRight);
                }else{
                    right[j]=column;
                    currentRight = j;
                }
            }

            for(int j=0;j<column;j++){
                maxArea = Math.max(maxArea,(right[j]-left[j])*height[j]);
            }

        }
        return maxArea;
    }
}
