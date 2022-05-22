package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 *
 * 输入: rowIndex = 0
 * 输出: [1]
 *
 * Created by zeyuan on 2022/5/19.
 */
public class PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> preItems = null;
        for(int i=0;i<=rowIndex;i++){
            List<Integer> currentItems = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    currentItems.add(1);
                    continue;
                }
                currentItems.add(preItems.get(j-1)+preItems.get(j));
            }
            preItems = currentItems;
        }
        return preItems;
    }
}
