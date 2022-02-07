package Greedy;

import java.util.Stack;

public class Greedy_921_MinimumAddMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '(') {
                stack.push(each);
            }
            else if (each == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        return stack.size() + count;
    }
}
