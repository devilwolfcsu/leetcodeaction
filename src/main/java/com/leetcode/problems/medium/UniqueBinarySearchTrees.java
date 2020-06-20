package com.leetcode.problems.medium;

/**
 *  96. 不同的二叉搜索树 Unique Binary Search Trees
 *  给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 *
 *  输入: 3
 *  输出: 5
 *  解释:
 *   给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
 * Created by zeyuan on 2020/6/18.
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {

        // G(n) 为 长度为N的时候的二叉搜索树个数
        // F(i,n) 为 以i为根节点数为n 的二叉搜索树个数
        // F(i,n) = G(i-1) * G（n-i）
        // G(n) = for(i=0;i<n;i++){F(i,n)}
        if(n==0||n==1){
            return 1;
        }
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for(int i=2;i<=n;i++){

            for(int j=1;j<=i;j++){
                G[i] += G[j-1]*G[i-j];
            }

        }
        return G[n];
    }
}
