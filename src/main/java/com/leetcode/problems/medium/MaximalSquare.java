package com.leetcode.problems.medium;

/**
 *  221. 最大正方形 Maximal Square
 *  在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *  [示例1]
 *  输入:
 *
 *  1 0 1 0 0
 *  1 0 1 1 1
 *  1 1 1 1 1
 *  1 0 0 1 0
 *  输出: 4
 *
 *
 * Created by zeyuan on 2020/5/24.
 */
public class MaximalSquare {

    private static final char ONE = '1';

    private static final char ZERO = '0';

    public int maximalSquare(char[][] matrix) {

        if(matrix==null||matrix.length==0){
            return 0;
        }

        matrix = reconstructMatrix(matrix);
        // 该位置最大长度信息 默认为0 不为0 表示已经计算过了
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] matrixLenght = new int[row+2][column+2];
        int maxSquareLength = 0;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                //  当前如果值不为1 则直接跳过
                if(matrix[i][j]!=ONE){
                    continue;
                }
                int currentLength = 1;
                currentLength  += getMaxSquareLength(matrix,matrixLenght,i,j);
                if(maxSquareLength <currentLength){
                    maxSquareLength = currentLength;
                }
                matrixLenght[i][j]=currentLength;
            }
        }

        return maxSquareLength*maxSquareLength;
    }

    private int getMaxSquareLength(char[][] matrix,int[][] matrixLenght, int i,int j){

        // 已经访问过，直接返回值
        if(matrixLenght[i][j]!=0){
           return matrixLenght[i][j];
        }
        int currentLenght = 0;
        // 当前点的的 右、下、右不为为1 否则退出
        if(matrix[i+1][j]==ZERO||matrix[i][j+1]==ZERO||matrix[i+1][j+1]==ZERO){
            // 返回 0 表示不继续向下
            return currentLenght;
        }
        currentLenght++;

        int downLenght = getMaxSquareLength(matrix,matrixLenght,i+1,j);
        int rightLenght = getMaxSquareLength(matrix,matrixLenght,i,j+1);
        int downRightLenght = getMaxSquareLength(matrix,matrixLenght,i+1,j+1);
        int minLenght = Math.min(Math.min(downLenght,rightLenght),downRightLenght);
        currentLenght+=minLenght;
        matrixLenght[i][j] = currentLenght;
        return currentLenght;
    }

    //重新构建matrix数组，对行列四周都加上值为0的数，方便遍历
    // matrix不为空，肯定存在元素
    private char[][] reconstructMatrix(char[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        // 重构一个 row+2 ,column+2 的元素
        char[][] result = new char[row+2][column+2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[i+1][j+1] = matrix[i][j];
            }
        }
        for(int i=0;i<result[0].length;i++){
            result[0][i] = ZERO;
            result[result.length-1][i] = ZERO;
        }
        for(int i=0;i<result.length;i++){
            result[i][0] = ZERO;
            result[i][result[i].length-1] = ZERO;
        }
        return result;
    }
}
