package com.leetcode.problems.easy;

import com.leetcode.problems.TreeNode;

/**
 * 783. 二叉搜索树节点最小距离 Minimum Distance Between BST Nodes
 * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
 *
 *
 * Created by zeyuan on 2020/7/19.
 */
public class MinimumDistanceBSTNodes {
    private Integer pre;
    private Integer result;

    public int minDiffInBST(TreeNode root) {
        pre =null;
        result = Integer.MAX_VALUE;
        dfs(root);
        return result;
    }

    //中序遍历
    private void dfs(TreeNode root){
      if(root==null){
          return;
      }
      dfs(root.left);
      if(pre!=null){
          result = Math.min(result,root.val-pre);
      }
      pre = root.val;
      dfs(root.right);
    }
}
