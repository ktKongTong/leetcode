package swordToOfferSA._0021_0040;

import java.util.Stack;

public class _0036_EvalRPN {
    public int evalRPN(String[] tokens) {
        // 数值栈
        Stack<Integer> numsStack = new Stack<>();
        // 遍历数组
        int n1;
        int n2;
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 + n1);
                }
                case "-" -> {
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 - n1);
                }
                case "*" -> {
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 * n1);
                }
                case "/" -> {
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 / n1);
                }
                default -> numsStack.push(Integer.parseInt(token));
            }
        }
        return numsStack.pop();
    }
}