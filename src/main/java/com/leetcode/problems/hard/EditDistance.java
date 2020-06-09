package com.leetcode.problems.hard;

/**
 * 72. 编辑距离 Edit Distance  动态规划
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 你可以对一个单词进行如下三种操作：
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *
 * [示例1]
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 *  horse -> rorse (将 'h' 替换为 'r')
 *  rorse -> rose (删除 'r')
 *  rose -> ros (删除 'e')
 * [示例2]
 * 输入：word1 = "intention", word2 = "execution"
 * 输出：5
 * 解释：
 * intention -> inention (删除 't')
 * inention -> enention (将 'i' 替换为 'e')
 * enention -> exention (将 'n' 替换为 'x')
 * exention -> exection (将 'n' 替换为 'c')
 * exection -> execution (插入 'u')
 *
 * Created by zeyuan on 2020/6/9.
 */
public class EditDistance {

    public int minDistance(String word1, String word2) {

        if(word1==null&& word2==null){
            return 0;
        }
        if(word1==null) {
            return word2.length();
        }
        if(word2==null){
            return word1.length();
        }
        int word1Lenght = word1.length();
        int word2Lenght = word2.length();
        int [][] distance = new int[word1Lenght + 1][word2Lenght + 1];
        // 边界状态初始化
        for (int i = 0; i < word1Lenght + 1; i++) {
            distance[i][0] = i;
        }
        for (int j = 0; j < word2Lenght + 1; j++) {
            distance[0][j] = j;
        }

        for(int i=1;i<word1Lenght+1;i++){
            for(int j=1;j<word2Lenght+1;j++){
                int left = distance[i - 1][j] + 1;
                int down = distance[i][j - 1] + 1;
                int left_down = distance[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1))
                    left_down += 1;
                distance[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return distance[word1Lenght][word2Lenght];
    }
}
