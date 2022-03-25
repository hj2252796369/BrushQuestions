package com.demo.niuke;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8ccc2?tpId=117&tqId=37749&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Ftab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D117%26page%3D1%26search%3D52&difficulty=undefined&judgeStatus=undefined&tags=&title=52
 *
 * @program: BrushQuestions
 * @ClassName NC52_有效括号序列
 * @description:
 * @author: huJie
 * @create: 2022-03-25 17:35
 **/
public class NC52_有效括号序列 {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }

    /**
     * @param s string字符串
     * @return bool布尔型
     */
    public static boolean isValid(String s) {
        // write code here
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
                continue;
            }

            if (chars[i] == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '(') {
                    return false;
                }
            }
            if (chars[i] == ']') {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '[') {
                    return false;
                }
            }
            if (chars[i] == '}' && !stack.isEmpty()) {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '{') {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;


    }
}
