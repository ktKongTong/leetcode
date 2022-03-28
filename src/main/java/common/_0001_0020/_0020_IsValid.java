package common._0001_0020;

import java.util.HashMap;
import java.util.Stack;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/25
 */
public class _0020_IsValid {
    private HashMap<Character,Character> map = new HashMap<>(){{
        put(')','(');
        put(']','[');
        put('}','{');
    }};

    public boolean isValid(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if(map.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
