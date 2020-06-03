package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.*;

/**
 * 103. 二叉树的锯齿形层次遍历 Binary Tree Zigzag Level Order Traversal
 *
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * Created by zeyuan on 2020/6/3.
 */
public class ZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root==null){
            return Collections.emptyList();
        }
        int level = 1;
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
            if(level%2!=0){
                result.add(items);
            }else{
                Collections.reverse(items);
                result.add(items);
            }
            level++;
        }

        return result;
    }
}
