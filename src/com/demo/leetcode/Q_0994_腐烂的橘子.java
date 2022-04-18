package com.demo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/rotting-oranges/
 *
 * @program: BrushQuestions
 * @ClassName Q_994_腐烂的橘子
 * @description:
 * @author: huJie
 * @create: 2022-04-02 17:34
 **/
public class Q_0994_腐烂的橘子 {
    public static void main(String[] args) {


        int[][] gird = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        int i = orangesRotting(gird);
        System.out.println(i);
    }

    public static int orangesRotting(int[][] grid) {

        //思路：
        //1.刚开始将所有烂橘子位置压入队列,并统计新鲜橘子数量;
        //2.bfs从烂橘子位置开始遍历,让所有新鲜橘子摆烂,并且把本次摆烂的橘子压入队列;
        //3.由上一层摆烂的橘子继续向其四周扩散,以此层层迭代;
        //4.随着摆烂蔓延,新鲜橘子越来越少,最后判断时间;

        //定义4个方向的位移
        int[] dx = new int[]{1, 0, 0, -1};
        int[] dy = new int[]{0, 1, -1, 0};

        //创建时间变量来计时
        int time = 0;

        //新鲜橘子计数,用于最后判断没被感染的橘子
        int cnt = 0;

        //先将烂橘子压入队列
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //烂橘子加入队列
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    ++cnt;
                }
            }
        }

        //如果新鲜橘子为0,返回0
        if (cnt == 0){
            return 0;
        }

        //摆烂时刻！
        while (!queue.isEmpty()) {
            //每次从当前的所有烂橘子向其四周开始腐烂一次
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();

                int x = cell[0], y = cell[1];

                for (int j = 0; j < 4; j++) {
                    int mx = x + dx[j];
                    int my = y + dy[j];

                    if (mx >= 0 && my >= 0 && mx < m && my < n && grid[mx][my] == 1) {
                        //新鲜橘子摆烂
                        grid[mx][my] = 2;
                        //将本次队列腐烂的所有橘子压入队列
                        queue.add(new int[]{mx, my});
                        //新鲜橘子减少
                        --cnt;
                    }
                }
            }
            //BFS的每一层作为一次时间增加
            ++time;
        }

        //因为队列中最后一层橘子遍历后时间会加1,但没有橘子被继续感染,此处多了一次1
        return cnt == 0 ? time - 1 : -1;
    }


}
