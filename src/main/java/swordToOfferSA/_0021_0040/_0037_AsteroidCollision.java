package swordToOfferSA._0021_0040;

import java.util.Stack;

public class _0037_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            // 栈为空，直接入栈
            if (stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroids[i]);
                continue;
            }
            int top = stack.peek();
            // 同向/方向相反，直接入栈
            if (top > 0 && asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            }
            int temp = top + asteroids[i];
            if (temp <= 0) {
                stack.pop();
            }
            // 栈内右向，栈外左向，左大于右，出栈直到左小于右或同向
            if (temp < 0) {
                i = i - 1;
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
//            Stack<Integer> stack = new Stack<>();
//        for(int i = 0; i < asteroids.length; i++){
//            if(asteroids[i] > 0){
//                stack.push(asteroids[i]);
//            }else{
//                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroids[i]){
//                    stack.pop();
//                }
//                if(stack.isEmpty() || stack.peek() < 0){
//                    stack.push(asteroids[i]);
//                }
//            }
//        }
//        int[] res = new int[stack.size()];
//        for(int i = res.length - 1; i >= 0; i--){
//            res[i] = stack.pop();
//        }
//        return res;

