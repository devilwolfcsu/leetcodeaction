package com.leetcode.problems.easy;

import com.leetcode.problems.TreeNode;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II Binary Tree Level Order Traversal II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * Created by zeyuan on 2020/6/3.
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> treeNodes  = new LinkedList<TreeNode>();
        treeNodes.offer(root);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while(!treeNodes.isEmpty()){
            int size  = treeNodes.size();
            List<Integer> items = new ArrayList<Integer>();
            for(int i=0;i<size;i++){

                TreeNode node = treeNodes.poll();
                items.add(node.val);
                if(node.left!=null){
                    treeNodes.offer(node.left);
                }
                if(node.right!=null){
                    treeNodes.offer(node.right);
                }
            }
            result.add(items);
        }
        Collections.reverse(result);
        return result;
    }
}
