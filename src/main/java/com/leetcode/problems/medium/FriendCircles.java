package com.leetcode.problems.medium;

/**
 *  547. 朋友圈 (Friend Circles)
 *  班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，
 *  那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。给定一个 N * N 的矩阵 M，表示班级中学生之间
 *  的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。
 *  [示例1]
 *  输入:
 *   [[1,1,0],
 *    [1,1,0],
 *    [0,0,1]]
 *    输出: 2
 *  说明：已知学生0和学生1互为朋友，他们在一个朋友圈。
 *  第2个学生自己在一个朋友圈。所以返回2。
 *  [示例2]
 *  输入:
 *   [[1,1,0],
 *   [1,1,1],
 *   [0,1,1]]
 *   输出: 1
 *   说明：已知学生0和学生1互为朋友，学生1和学生2互为朋友，所以学生0和学生2也是朋友，所以他们三个在一个朋友圈，返回1。
 *
 *  注意：
 *    N 在[1,200]的范围内。
 *    对于所有学生，有M[i][i] = 1。
 *    如果有M[i][j] = 1，则有M[j][i] = 1。
 * Created by zeyuan on 2020/5/1.
 */
public class FriendCircles {

    //
    public int findCircleNum(int[][] M) {

        // 空数组 则直接返回0
        if(M==null || M.length==0){
            return 0;
        }
        // 父接点数组
        int[] parent = new int[M.length];
        for(int i=0;i<M.length;i++){
            parent[i] = i; // 默认该接点的父节点为自己
        }
        int count = M.length;
        for(int i=0;i<M.length;i++){
            for(int j=i+1;j<M.length;j++){
                if(M[i][j]==1){// 该节点 i 与 j 之间为朋友
                    int x = findParent(parent,i);
                    int y = findParent(parent,j);
                    if(x != y){
                        union(parent,x,y);
                        count--;
                    }
                }
            }
        }
        return count;
    }

    private int findParent(int[] parent,int node){
        if(parent[node] != node){ // 该节点的父亲不是自身，则向上查找
            parent[node] = findParent(parent,parent[node]); // 路径压缩
        }
        return parent[node];
    }

    // 合并两个子树的根
    private void union(int[] parent,int i,int j){
        parent[i] = j;
    }

}
