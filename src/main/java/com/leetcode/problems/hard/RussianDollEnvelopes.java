package com.leetcode.problems.hard;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 354. 俄罗斯套娃信封问题 Russian Doll Envelopes
 *
 * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，
 * 这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * 说明:
 * 不允许旋转信封。
 *
 * [示例1]
 * 输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出: 3
 * 解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 * Created by zeyuan on 2020/5/25.
 */
public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {

        if(envelopes==null||envelopes.length==0){
            return 0;
        }
        if(envelopes.length==1){
            return 1;
        }
        // 预处理
        // [w，h] 按照W升序列进行排列，如果相等则按照h逆序排列
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {

                return  o1[0] == o2[0]?o2[1]-o1[1]:o1[0]-o2[0];
            }
        });

        int[] height = new int[envelopes.length];
        for(int i=0;i<envelopes.length;i++){
            height[i] = envelopes[i][1];
        }

        // 最长递增子序列求法
        int[] dp = new int[height.length];
        Arrays.fill(dp,1);
        for(int i=0;i<height.length;i++){
            for(int j=0;j<i;j++){
                if(height[j]<height[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int result = dp[0];
        for(int i=1;i<dp.length;i++){
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
