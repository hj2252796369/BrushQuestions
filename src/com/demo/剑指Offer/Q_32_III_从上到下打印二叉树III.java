package com.demo.剑指Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 *
 * @program: BrushQuestions
 * @ClassName Q_32_II_从上到下打印二叉树II
 * @description:
 * @author: huJie
 * @create: 2022-04-01 14:49
 **/
public class Q_32_III_从上到下打印二叉树III {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);

    }

    public static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> levelOrder(TreeNode root) {

        int high = 0;

        dfs(root, high);

        for (int i = 0; i < result.size(); i++) {
            if(i % 2 == 1){
                Collections.reverse(result.get(i));
            }
        }

        return result;

    }

    public static void dfs(TreeNode root, int high) {
        if (root != null) {

            if (result.size() <= high) {
                result.add(new ArrayList<>());
            }
            result.get(high).add(root.val);


            dfs(root.left, high+1);
            dfs(root.right, high+1);

        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
