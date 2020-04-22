package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 71. 简化路径 （Simplify Path）
 * [题目]
 * 以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；
 * 两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
 * 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）
 * 不能以 / 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
 *
 * [示例1]
 * 输入："/home/"
 * 输出："/home"
 * 解释：注意，最后一个目录名后面没有斜杠。
 *
 * [示例2]
 * 输入："/../"
 * 输出："/"
 * 解释：从根目录向上一级是不可行的，因为根是你可以到达的最高级。
 *
 * [示例3]
 * 输入："/home//foo/"
 * 输出："/home/foo"
 * 解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
 * Created by zeyuan on 2020/4/22.
 */
public class SimplifyPath {

    public String simplifyPath(String path) {

        if(path.length()<=1){
            return "/";
        }
        int preIndex =1; // 上一个/的位置坐标
        int currentIndex=path.indexOf("/",preIndex);
        List<String> pathItems = new ArrayList<String>();
        while(currentIndex != -1) {
            String pathItem = path.substring(preIndex,currentIndex);
            preIndex = currentIndex+1;
            currentIndex = path.indexOf("/",preIndex);
            if(pathItem.equals("..")){// 向前跳一个路径
                if(pathItems.size()>0) {
                    pathItems.remove(pathItems.size() - 1);
                }
                continue;
            }
            if(pathItem.equals(".")||pathItem.equals("")){// 什么也不做
                continue;
            }
            pathItems.add(pathItem); // 加入路径
        }
        // 处理最后一个/ 不在最后的情况
        if(preIndex != path.length()){
            String pathItem = path.substring(preIndex);
            if(pathItem.equals("..")){
                if(pathItems.size()>0) {
                    pathItems.remove(pathItems.size() - 1);
                }
            }else if(!pathItem.equals(".")){
                pathItems.add(pathItem);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<pathItems.size();i++){
            stringBuilder.append("/");
            stringBuilder.append(pathItems.get(i));
        }
        String result = stringBuilder.toString();
        return result.equals("")?"/":result;
    }
}
