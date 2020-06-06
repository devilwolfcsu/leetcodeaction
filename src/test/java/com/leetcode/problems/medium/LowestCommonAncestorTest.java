package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;
import org.testng.annotations.Test;

/**
 * LowestCommonAncestor 测试
 * Created by zeyuan on 2020/6/6.
 */
public class LowestCommonAncestorTest {

    @Test
    public void testLowestCommonAncestor(){

        TreeNode root = new TreeNode(3);

        TreeNode tmpLeft = new TreeNode(5);
        TreeNode tmpRight = new TreeNode(1);
        TreeNode p = tmpLeft;
        root.left = tmpLeft;
        root.right = tmpRight;
        tmpLeft.left = new TreeNode(6);

        TreeNode tmpNode = new TreeNode(2);
        tmpNode.left = new TreeNode(7);
        TreeNode q = new TreeNode(4);
        tmpNode.right = q;
        tmpLeft.right = tmpNode;

        tmpRight.left = new TreeNode(0);
        tmpRight.right = new TreeNode(8);

        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        TreeNode result =lowestCommonAncestor.lowestCommonAncestor(root,p,q);

    }
}
