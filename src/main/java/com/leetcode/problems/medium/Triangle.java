package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 *  120. 三角形最小路径和  Triangle
 *
 *  给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *  相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 *  [示例]
 *  例如，给定三角形：
 *  [
 *    [2],
 *   [3,4],
 *  [6,5,7],
 * [4,1,8,3]
 *          ]
 *
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * Created by zeyuan on 2020/5/24.
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        List<List<Integer>>  path = new ArrayList<List<Integer>>();
        List<Integer> prePathItem = new ArrayList<Integer>();
        for(int i=0;i<triangle.size();i++){
            List<Integer> items = triangle.get(i);
            List<Integer> pathItem = new ArrayList<Integer>();
            for(int j =0;j<items.size();j++){
                if(i==0){
                    pathItem.add(items.get(j));
                }else {
                    pathItem.add(getMinPath(prePathItem,j)+items.get(j));
                }
            }
            path.add(pathItem);
            prePathItem = pathItem;
        }

        List<Integer> leafPath = path.get(path.size()-1);
        int result = leafPath.get(0);
        for(int i=1;i<leafPath.size();i++){
            if(result>leafPath.get(i)){
                result = leafPath.get(i);
            }
        }
        return result;
    }

    private int getMinPath(List<Integer> prePath,int i){
        if(i==0){
            return prePath.get(i);
        }
        if(i>prePath.size()-1){
            return prePath.get(i-1);
        }
        return Math.min(prePath.get(i),prePath.get(i-1));
    }
}
