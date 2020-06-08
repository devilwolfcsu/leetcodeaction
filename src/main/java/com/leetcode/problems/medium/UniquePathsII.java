package com.leetcode.problems.medium;

/**
 * 63. 不同路径 II Unique Paths II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * 说明：m 和 n 的值均不超过 100。
 *
 * [示例1]
 * 输入:
 * [
 *  [0,0,0],
 *  [0,1,0],
 *  [0,0,0]
 *  ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 *
 * Created by zeyuan on 2020/6/8.
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if(obstacleGrid==null||obstacleGrid.length==0){
            return 0;
        }
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] pathNum = new int[row+2][column+2];
        pathNum[0][1] =1;
        for(int i=1;i<row+1;i++){

            for(int j=1;j<column+1;j++){
                if(obstacleGrid[i-1][j-1]==1){
                    pathNum[i][j] =0;
                }else{
                    pathNum[i][j] = pathNum[i-1][j] + pathNum[i][j-1];
                }

            }
        }
        return pathNum[row][column];
    }
}
