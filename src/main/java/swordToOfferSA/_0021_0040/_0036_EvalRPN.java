package swordToOfferSA._0021_0040;

import java.util.Stack;
/**
 * @Title  后缀表达式
 * @Link   https://leetcode-cn.com/problems/8Zf90G/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0036_EvalRPN {
    public int evalRPN(String[] tokens) {
        // 数值栈
        Stack<Integer> numsStack = new Stack<>();
        // 遍历数组
        int n1;
        int n2;
        for (String token : tokens) {
            switch (token) {
                case "+" :
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 + n1);
                    break;
                case "-" :
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 - n1);
                    break;
                case "*" :
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 * n1);
                    break;
                case "/" :
                    n1 = numsStack.pop();
                    n2 = numsStack.pop();
                    numsStack.push(n2 / n1);
                    break;
                default :
                    numsStack.push(Integer.parseInt(token));
                    break;
            }
        }
        return numsStack.pop();
    }
}