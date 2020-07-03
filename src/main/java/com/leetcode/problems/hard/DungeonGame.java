package com.leetcode.problems.hard;

import java.util.Arrays;

/**
 * 174. 地下城游戏  Dungeon Game
 * 一些恶魔抓住了公主（P）并将她关在了地下城的右下角。地下城是由 M x N 个房间组成的二维网格。
 * 我们英勇的骑士（K）最初被安置在左上角的房间里，他必须穿过地下城并通过对抗恶魔来拯救公主。
 * 骑士的初始健康点数为一个正整数。如果他的健康点数在某一时刻降至 0 或以下，他会立即死亡。
 * 有些房间由恶魔守卫，因此骑士在进入这些房间时会失去健康点数（若房间里的值为负整数，则表示
 * 骑士将损失健康点数）；其他房间要么是空的（房间里的值为 0），要么包含增加骑士健康点数的魔法球（
 * 若房间里的值为正整数，则表示骑士将增加健康点数）。
 * 为了尽快到达公主，骑士决定每次只向右或向下移动一步。
 *
 * 编写一个函数来计算确保骑士能够拯救到公主所需的最低初始健康点数。
 * 例如，考虑到如下布局的地下城，如果骑士遵循最佳路径 右 -> 右 -> 下 -> 下，则骑士的初始健康点数至少为 7。
 *
 * 说明:
 * 骑士的健康点数没有上限。
 * 任何房间都可能对骑士的健康点数造成威胁，也可能增加骑士的健康点数，包括骑士进入的左上角房间以及公主被监禁的右下角房间。
 *
 *
 *
 * Created by zeyuan on 2020/7/2.
 */
public class DungeonGame {

    public int calculateMinimumHP(int[][] dungeon) {

        if (dungeon == null || dungeon.length == 0) {
            return 0;
        }
        //使用两个数组来处理
        int m = dungeon.length;
        int n = dungeon[0].length;
        // 当前剩余健康点数 0 行 0 列为防御位置

        // minIniHealthNum[i][j] 表示 在 i,j 位置 至少需要多少健康点数
        int[][] minInitHealthNum = new int[m+1][n+1];
        Arrays.fill(minInitHealthNum[m],Integer.MAX_VALUE);
        for(int i=0;i<m+1;i++){
            minInitHealthNum[i][n] = Integer.MAX_VALUE;
        }
        minInitHealthNum[m-1][n] = 1;
        for (int i = m-1; i>=0; i--) {

            for (int j = n-1; j >=0; j--) {
                minInitHealthNum[i][j] = Math.max(1,Math.min(minInitHealthNum[i+1][j],minInitHealthNum[i][j+1])-dungeon[i][j]);
            }
        }
        return minInitHealthNum[0][0];
    }
}
