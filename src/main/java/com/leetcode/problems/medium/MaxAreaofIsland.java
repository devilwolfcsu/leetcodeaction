package com.leetcode.problems.medium;

/**
 * 695. 岛屿的最大面积 Max Area of Island
 *
 * 给定一个包含了一些 0 和 1 的非空二维数组 grid 。一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，
 * 这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。)
 *
 * [示例1]
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
 * [示例2]
 * [[0,0,0,0,0,0,0,0]]
 * 对于上面这个给定的矩阵, 返回 0。
 *
 * 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 * Created by zeyuan on 2020/5/10.
 */
public class MaxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid) {

        if(grid==null|| grid.length==0){
            return 0;
        }

        int[][] newGrid = reconstructGrid(grid);
        int result  =0;
        for(int i=1;i<newGrid.length-1;i++){

            for(int j=1;j<newGrid[i].length-1;j++){
                // 该位置为1则直接 并且未被访问过
                if(newGrid[i][j]==1){
                    int count = getCurrentCount(newGrid,i,j);
                    if(result<count){
                        result = count;
                    }
                }
            }
        }
        return result;
    }

    /** 查找该位置起点的岛屿面积 */
    private int getCurrentCount(int[][] grid,int i,int j){
        // 当前位置grid[i][j] == 1
        grid[i][j]=0;//先将当前位置置为0表示已经访问统计过
        int result = 1;
        // 上
        if(grid[i-1][j]==1){
            int count = getCurrentCount(grid,i-1,j);
            result +=count;
        }
        // 右
        if(grid[i][j+1]==1){
            int count =getCurrentCount(grid,i,j+1);
            result +=count;
        }
        if(grid[i+1][j]==1){
            int count =getCurrentCount(grid,i+1,j);
            result +=count;
        }
        if(grid[i][j-1]==1){
            int count = getCurrentCount(grid,i,j-1);
            result += count;
        }
        return result;
    }
    //重新构建grid数组，对行列四周都加上值为0的数，方便遍历
    // grid不为空，肯定存在元素
    private int[][] reconstructGrid(int[][] grid){
        int row = grid.length;
        int column = grid[0].length;
        // 重构一个 row+2 ,column+2 的元素
        int[][] result = new int[row+2][column+2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                result[i+1][j+1] = grid[i][j];
            }
        }
        return result;
    }
}
