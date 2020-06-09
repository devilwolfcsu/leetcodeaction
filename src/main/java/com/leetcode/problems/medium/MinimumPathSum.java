package com.leetcode.problems.medium;

/**
 * 64. 最小路径和 Minimum Path Sum
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * [示例1]
 * 输入:
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * Created by zeyuan on 2020/6/9.
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        int[][] pathNum = new int[row+2][column+2];
        pathNum[0][0] = grid[0][0];
        // 对第一列进行计算
        for(int i =1;i<row;i++){
            pathNum[i][0] = grid[i][0] + pathNum[i-1][0];
        }
        for(int j =1;j<column;j++){
            pathNum[0][j] = grid[0][j] + pathNum[0][j-1];
        }

        for(int i=1;i<row;i++) {
            for (int j = 1; j < column; j++) {
                int minPath = Math.min(pathNum[i-1][j],pathNum[i][j-1]);
                pathNum[i][j] = grid[i][j] +minPath;
            }
        }
        return pathNum[row-1][column-1];
    }
}
