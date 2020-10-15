package 栈排序;

import java.util.Stack;

public class Solution {
    /**
     * @param : String s
     * @return : boolean
     * @throws :
     * @Description ：使用栈进行括号匹配
     * @author : tanguochao
     * @date : 2019/10/11 14:32
     */
    public boolean kuohaoMatch(String s) {

        //如果为null，返回false
        if (s.length() == 0) {
            return false;
        }
        //如果不成对，返回false
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        //遍历输入字符串，如果当前为左括号，压栈
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            //有其他字符直接返回false
            if (c != '(' && c != ')' && c != '[' && c != ']' && c != '{' && c != '}') {
                return false;
            }
            //传入的为左括号，压栈
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                //匹配右括号分三种情况：
                //第一种情况，栈为null，返回false；
                //第二种情况，右括号与压栈字符不匹配，返回false
                //第三种情况，栈不为null且为对应括号，取栈顶，返回true
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (stack.peek() != '(') {//peek()函数返回栈顶的元素，但不弹出该栈顶元素。
                        return false;
                    } else {
                        stack.pop();//pop()函数返回栈顶的元素，并且将该栈顶元素出栈。
                    }
                } else if (c == ']') {
                    if (stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    if (stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }

    }


    public static void main(String[] args) {
//        String expression = "{()}";//true
        String expression = "{)(())";//false

        Solution s = new Solution();

        boolean result = s.kuohaoMatch(expression);

        if (result) {
            System.out.println("匹配成功！");
        } else {
            System.out.println("匹配失败 ");
        }
    }
}
