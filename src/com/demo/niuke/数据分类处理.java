package com.demo.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @program: BrushQuestions
 * @ClassName 数据分类处理
 * @description:
 * @author: huJie
 * @create: 2022-04-03 10:25
 **/
public class 数据分类处理 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = br.readLine()) != null) {
                if (str.equals("")) continue;
                //需要过了的I
                String[] I = str.split(" ");
                // R
                String[] temp = br.readLine().split(" ");
                long[] R = new long[Integer.parseInt(temp[0])];
                for (int i = 0; i < R.length; i++) R[i] = Long.parseLong(temp[i+1]);
                //先对R进行排序 然后在依次遍历
                Arrays.sort(R);
                //最终的结果记录
                StringBuilder result = new StringBuilder();
                int count = 0;
                for (int i = 0; i < R.length; i++) {
                    //当R中的值相等的时候 只保留第一个出现的
                    if (i > 0 && R[i] == R[i-1]) continue;
                    //需要进行匹配的字符
                    String pattern = R[i] + "";
                    int num = 0;
                    StringBuilder index = new StringBuilder();
                    for (int j = 1; j < I.length; j++) {
                        //说明出现了 找到位置
                        if (I[j].indexOf(pattern) != -1) {
                            num++;
                            index.append(" ").append(j-1).append(" ").append(I[j]);
                        }
                    }
                    //说明存在跟此时R[i]匹配的I
                    if (num > 0){
                        result.append(" ").append(R[i]).append(" ").append(num).append(index);
                        count += num*2+2;
                    }
                }
                System.out.println(count + result.toString());
            }
        }

}
