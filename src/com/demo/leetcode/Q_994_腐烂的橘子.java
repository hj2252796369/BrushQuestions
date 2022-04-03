package com.demo.leetcode;

/**
 * https://leetcode-cn.com/problems/rotting-oranges/
 *
 * @program: BrushQuestions
 * @ClassName Q_994_腐烂的橘子
 * @description:
 * @author: huJie
 * @create: 2022-04-02 17:34
 **/
public class Q_994_腐烂的橘子 {
    public static void main(String[] args) {


        int[][] gird = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        int i = orangesRotting(gird);
        System.out.println(i);
    }

    public static int orangesRotting(int[][] grid) {

        // 检查有没有桔子临近是没有桔子的  如果有直接返回-1
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (i == 0) {
                    if (j == 0){
                        
                    }
                }

            }
        }

        return 0;
    }


}
