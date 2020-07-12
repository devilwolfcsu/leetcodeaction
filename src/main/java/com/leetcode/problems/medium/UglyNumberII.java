package com.leetcode.problems.medium;

/**
 *  264. 丑数 II Ugly Number II
 *
 *  编写一个程序，找出第 n 个丑数。
 *  丑数就是质因数只包含 2, 3, 5 的正整数。
 *
 *  示例1
 *  输入: n = 10
 *  输出: 12
 *  解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 *
 * Created by zeyuan on 2020/7/3.
 */
public class UglyNumberII {

    public static Ugly u = new Ugly();

    public int nthUglyNumber(int n) {

        return u.nums[n-1];
    }
}

class Ugly {
    public int[] nums = new int[1690];
    Ugly() {
        nums[0] = 1;
        int ugly, i2 = 0, i3 = 0, i5 = 0;

        for(int i = 1; i < 1690; ++i) {
            ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
            nums[i] = ugly;

            if (ugly == nums[i2] * 2) ++i2;
            if (ugly == nums[i3] * 3) ++i3;
            if (ugly == nums[i5] * 5) ++i5;
        }
    }
}
