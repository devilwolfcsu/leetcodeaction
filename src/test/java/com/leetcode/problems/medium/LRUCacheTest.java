package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LRUCache 测试
 * Created by zeyuan on 2020/5/31.
 */
public class LRUCacheTest {

    @Test
    public  void testLRUCache(){

        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(cache.get(1),1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        Assert.assertEquals(cache.get(2),-1);      // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        Assert.assertEquals(cache.get(1),-1);       // 返回 -1 (未找到)
        Assert.assertEquals(cache.get(3),3);       // 返回  3
        Assert.assertEquals(cache.get(4),4);       // 返回  4
    }
}
