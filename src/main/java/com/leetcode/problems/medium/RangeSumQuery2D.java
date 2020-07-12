package com.leetcode.problems.medium;

/**
 * 304. 二维区域和检索 - 矩阵不可变  Range Sum Query 2D - Immutable
 * 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2)。
 * 上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。
 *
 * 示例
 * 给定
 * matrix = [
 *    [3, 0, 1, 4, 2],
 *    [5, 6, 3, 2, 1],
 *    [1, 2, 0, 1, 5],
 *    [4, 1, 0, 1, 7],
 *    [1, 0, 3, 0, 5]
 *  ]
 *
 *  sumRegion(2, 1, 4, 3) -> 8
 *  sumRegion(1, 1, 2, 2) -> 11
 *  sumRegion(1, 2, 2, 4) -> 12
 * Created by zeyuan on 2020/7/12.
 */
public class RangeSumQuery2D {


    //按照行记录的数据和大小
    private int[][] rowSum;

    public RangeSumQuery2D(int[][] matrix) {
        int row = matrix.length;
        if(row!=0){
            int column = matrix[0].length;
            rowSum = new int[row][column+1];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    rowSum[i][j+1] = rowSum[i][j] + matrix[i][j];
            }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        if(rowSum==null||rowSum.length==0){
            return 0;
        }
        int result = 0;
        for(int i=row1;i<=row2;i++){
            result += rowSum[i][col2+1] -rowSum[i][col1];
        }
        return result;
    }
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */