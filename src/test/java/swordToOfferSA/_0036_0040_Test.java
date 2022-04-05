package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0021_0040.*;

/**
 * @Author KongTong
 * @Date   2022/4/1
 */
public class _0036_0040_Test {
    // 0036 后缀表达式
    @Test
    public void testEvalRPN(){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        _0036_EvalRPN evalRPN = new _0036_EvalRPN();
        int res = evalRPN.evalRPN(tokens);
        Assertions.assertEquals(22,res);
    }
    // 0037 小行星碰撞
    @Test
    public void testAsteroidCollision(){
        int[] asteroids = {5,10,-5};
        _0037_AsteroidCollision asteroidCollision = new _0037_AsteroidCollision();
        int[] res = asteroidCollision.asteroidCollision(asteroids);
        Assertions.assertArrayEquals(new int[]{5,10},res);
    }
    // 0038 每日温度
    @Test
    public void testDailyTemperatures(){
        int [] temperatures = {};
        _0038_DailyTemperatures dailyTemperatures = new _0038_DailyTemperatures();
        int [] res = dailyTemperatures.dailyTemperatures(temperatures);
        Assertions.assertEquals(res,new int[] {});
    }
    // 0039 直方图最大矩形面积
    @Test
    public void testLargestRectangleArea(){
        int [] heights = {};
        _0039_LargestRectangleArea largestRectangleArea = new _0039_LargestRectangleArea();
        int res = largestRectangleArea.largestRectangleArea(heights);
        Assertions.assertEquals(2,res);
    }
    // 0040 矩阵中最大的矩形
    @Test
    public void testMaximalRectangle(){
        String[] matrix = {};
        _0040_MaximalRectangle maximalRectangle = new _0040_MaximalRectangle();
        int res = maximalRectangle.maximalRectangle(matrix);
        Assertions.assertEquals(2,res);
    }
}
