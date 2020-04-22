package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 93. 复原IP地址 (Restore IP Addresses)
 * 回溯算法
 * [题目]
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 *
 * [示例]
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 * Created by zeyuan on 2020/4/21.
 */
public class RestoreIPAddresses {


    public List<String> restoreIpAddresses(String s) {
        //  超过12位或者小于4位 不是正常的IP地址
        if(s.length()>12||s.length()<4){
            return Collections.emptyList();
        }
        return splitIpList(s,4);
    }

    /**
     * 将该字符串按照IP地址的格式拆分成几段
     * @param s 字符串
     * @param nums 段数
     * @return  拆分的结果
     */
    private List<String> splitIpList(String s,int nums){

        if(nums==1){
            if(isSigleIpAddress(s)){
                return Arrays.asList(s);
            }else{
                return Collections.emptyList();
            }
        }

        List<String> result = new ArrayList<String>();
        if(s.length()>=1&&isSigleIpAddress(s.substring(0,1))){
            List<String> tmpList = splitIpList(s.substring(1,s.length()),nums-1);
            List<String> tmpResult = combIpAddress(s.substring(0,1),tmpList);
            if(!tmpResult.isEmpty()){
                result.addAll(tmpResult);
            }
        }
        if(s.length()>=2&&isSigleIpAddress(s.substring(0,2))){
            List<String> tmpList = splitIpList(s.substring(2,s.length()),nums-1);
            List<String> tmpResult = combIpAddress(s.substring(0,2),tmpList);
            if(!tmpResult.isEmpty()){
                result.addAll(tmpResult);
            }
        }
        if(s.length()>=3&&isSigleIpAddress(s.substring(0,3))){
            List<String> tmpList = splitIpList(s.substring(3,s.length()),nums-1);
            List<String> tmpResult = combIpAddress(s.substring(0,3),tmpList);
            if(!tmpResult.isEmpty()){
                result.addAll(tmpResult);
            }
        }
        return result;
    }

    private List<String> combIpAddress(String head,List<String> subIpAddress){

        if(subIpAddress==null||subIpAddress.isEmpty()){
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<String>();
        for(int i=0;i<subIpAddress.size();i++){
            result.add(head+"."+subIpAddress.get(i));
        }
        return result;
    }
    /**
     * 判断num1 是不是单一的IP地址模式
     * 0=<num1<=255
     * num1 不能是0开头的非0数字
     * num1 至少一位
     */
    private boolean isSigleIpAddress(String num1){

        if(num1.length()<1){
            return false;
        }
        // 首字符为 '0' 且只有1位 符合标准
        if(num1.charAt(0)=='0'&&num1.length()==1){
            return true;
        }
        if(num1.charAt(0)=='0'&&num1.length()>1){
            return false;
        }
        int result = 0;
        for(int i=0;i<num1.length();i++){
            result = result*10+(num1.charAt(i)-'0');
        }
        return result>=0&&result <=255;
    }
}
