package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * 输入: numRows = 1
 * 输出: [[1]]
 *
 * Created by zeyuan on 2022/5/19.
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> preItems = null;
        for(int i=1;i<=numRows;i++){
            List<Integer> currentItems = new ArrayList<>();
            for(int j=0;j<i;j++){
               if(j==0||j==i-1){
                   currentItems.add(1);
                   continue;
               }
               currentItems.add(preItems.get(j-1)+preItems.get(j));
            }
            preItems = currentItems;
            result.add(currentItems);
        }
        return result;
    }
}
