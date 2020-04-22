package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SimplifyPath 测试
 * Created by zeyuan on 2020/4/22.
 */
public class SimplifyPathTest {

    @Test
    public void testSimplifyPath(){

        SimplifyPath simplifyPath = new SimplifyPath();
        Assert.assertEquals(simplifyPath.simplifyPath("/home/"),"/home");
        Assert.assertEquals(simplifyPath.simplifyPath("/home//foo/"),"/home/foo");
        Assert.assertEquals(simplifyPath.simplifyPath("/../"),"/");
        Assert.assertEquals(simplifyPath.simplifyPath("/a/./b/../../c/"),"/c");
        Assert.assertEquals(simplifyPath.simplifyPath("/a/../../b/../c//.//"),"/c");
        Assert.assertEquals(simplifyPath.simplifyPath("/a//b////c/d//././/.."),"/a/b/c");
        Assert.assertEquals(simplifyPath.simplifyPath("/.."),"/");
        Assert.assertEquals(simplifyPath.simplifyPath("/."),"/");
    }
}
