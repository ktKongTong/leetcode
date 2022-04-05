package swordToOfferSA._0021_0040;

import java.util.Stack;
/**
 * @Title  直方图最大矩形面积
 * @Link   https://leetcode-cn.com/problems/0ynMMM/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0039_LargestRectangleArea {
    // todo
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1
                    && heights[stack.peek()] >= heights[i]) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        while (stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
