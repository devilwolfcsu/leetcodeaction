package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * RestoreIPAddresses  测试
 * Created by zeyuan on 2020/4/21.
 */
public class RestoreIPAddressesTest {

    @Test
    public void testRestoreIpAddresses(){

        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        List<String> result = restoreIPAddresses.restoreIpAddresses("25525511135");

        Assert.assertEquals(result.get(0),"255.255.11.135");
        Assert.assertEquals(result.get(1),"255.255.111.35");

        result = restoreIPAddresses.restoreIpAddresses("127001");

        Assert.assertEquals(result.get(0),"127.0.0.1");
        Assert.assertEquals(result.get(1),"12.70.0.1");
    }
}
