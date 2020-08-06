package com.leetcode.problems.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 42. 接雨水 (Trapping Rain Water)
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
 *
 * [示例1]
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * Created by zeyuan on 2020/5/8.
 */
public class TrappingRainWater {

    // 动态规划法
    public int trap(int[] height) {
        // 空或者只有一个元素直接返回0
        if(height==null||height.length<=1){
            return 0;
        }
        //从左遍历当前位置左边最高的位置
        int[] max_left = new int[height.length];
        int current_max_left = 0;
        for(int i=0;i<height.length;i++){
            if(current_max_left<height[i]){
                current_max_left = height[i];
            }
            max_left[i]=current_max_left;
        }
        // 从右遍历当前位置右边最高的区块
        int[] max_right = new int[height.length];
        int current_max_right = 0;
        for(int i= height.length-1;i>=0;i--){
            if(current_max_right<height[i]){
                current_max_right = height[i];
            }
            max_right[i] = current_max_right;
        }
        int result = 0;
        for(int i=0;i<height.length;i++ ){
            int current_height = Math.min(max_left[i],max_right[i]) - height[i];
            result += current_height;
        }
        return result;
    }

    /**
     * 使用栈的方式解问题
     * @param height
     * @return
     */
    public int trap2(int[] height){

        int result = 0;
        Deque<Integer> stack = new ArrayDeque();
        for(int i=0;i<height.length;i++){

            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){

                int index = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int distance = i-stack.peek()-1;
                int boundHeight = Math.min(height[i],height[stack.peek()]) - height[index];
                result += distance * boundHeight;
            }
            stack.push(i);
        }
        return result;
    }
}
