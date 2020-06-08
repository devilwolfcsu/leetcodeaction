package com.leetcode.problems.medium;

/**
 * 62. 不同路径 Unique Paths 动态规划
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 *
 * [示例1]
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 *
 * [示例2]
 * 输入: m = 7, n = 3
 * 输出: 28
 * Created by zeyuan on 2020/6/8.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {

        if(m==0&&n==0){
            return 0;
        }
        if(m==0||n==0){
            return 1;
        }

        // 增加边界
        int[][] pathNum = new int[n+2][m+2];
        pathNum[0][1] =1;
        // n行m列
        for(int i=1;i<n+1;i++){

            for(int j=1;j<m+1;j++){
                pathNum[i][j] = pathNum[i-1][j] + pathNum[i][j-1];
            }
        }
        return pathNum[n][m];
    }
}
