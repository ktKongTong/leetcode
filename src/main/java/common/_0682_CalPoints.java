package common;

import java.util.Stack;

/*
 * @Author KongTong
 * @Link https://leetcode-cn.com/problems/baseball-game/
 * @Title 682. 棒球比赛
 * @Date 2022/3/26
 */
public class _0682_CalPoints {
    public int calPoints(String[] ops) {
        if(ops.length <2){
            return Integer.parseInt(ops[0]);
        }
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String c: ops) {
             switch (c){
                 case "+" -> {
                     int a = stack.pop();
                     int b = stack.peek();
                     stack.push(a);
                     stack.push(a+b);
                     sum += a+b;
                 }
                 case "D" -> {
                     stack.push(stack.peek()*2);
                     sum += stack.peek();
                 }
                 case "C" -> sum -= stack.pop();
                 default ->{
                     stack.push(Integer.parseInt(c));
                     sum += stack.peek();
                 }
             }
        }
        return sum;
    }
}
