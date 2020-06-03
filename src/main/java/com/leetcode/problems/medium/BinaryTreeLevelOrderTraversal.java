package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.*;

/**
 * 102. 二叉树的层序遍历 Binary Tree Level Order Traversal
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * Created by zeyuan on 2020/6/3.
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return result;
    }
}
