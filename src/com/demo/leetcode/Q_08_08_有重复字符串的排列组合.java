package com.demo.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/permutation-ii-lcci/
 *
 * @program: BrushQuestions
 * @ClassName Q_08_08_有重复字符串的排列组合
 * @description:
 * @author: huJie
 * @create: 2022-03-29 09:52
 **/
public class Q_08_08_有重复字符串的排列组合 {


    public static void main(String[] args) {
        String str = "Frx";
        String[] permutation = permutation(str);
        System.out.println(Arrays.asList(permutation));
    }

    public static String[] permutation(String S) {

         Set<String> result = new HashSet();
        Deque<Character> path = new ArrayDeque<Character>();
        boolean[] used = new boolean[S.length()];

        dfs(S.toCharArray(), 0, path, used, result);
        return (String[])result.toArray(new String[result.size()]);
    }

    private static void dfs(char[] toCharArray, int depth, Deque<Character> path, boolean[] used, Set<String> result) {
        if(depth == toCharArray.length){
            String str = "";
            Iterator<Character> iterator = path.iterator();
            while (iterator.hasNext()){
                Character next = iterator.next();
                str+=next;
            }
            result.add(str);
            return;
        }

        for (int i = 0; i < toCharArray.length; i++) {
            if(used[i]){
                continue;
            }
            path.addLast(toCharArray[i]);
            used[i] = true;
            dfs(toCharArray, depth+1, path, used, result);

            path.removeLast();
            used[i] = false;

        }
    }

}
