package com.demo.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combinations/
 *
 * @program: BrushQuestions
 * @ClassName Q_77_组合
 * @description:
 * @author: huJie
 * @create: 2022-03-29 14:34
 **/
public class Q_77_组合 {
    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> combine = combine(n, k);
        System.out.println(combine);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        Deque<Integer> path = new ArrayDeque<Integer>();

        dfs(n, k, 1, path, result);
        return result;
    }

    private static void dfs(int n, int k, int start, Deque<Integer> path, List<List<Integer>> result) {

        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            dfs(n, k, i+1, path, result);
            path.removeLast();
        }

    }

}
