package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0001_0020.*;
import swordToOfferSA._0021_0040._0034_IsAlienSorted;
import swordToOfferSA._0021_0040._0035_FindMinDifference;
import swordToOfferSA._0021_0040._0036_EvalRPN;
import swordToOfferSA._0021_0040._0037_AsteroidCollision;

import java.util.Arrays;

public class _0021_0025_Test {

    @Test
    public void testCountSubstrings(){
        String s = "aaa";
        _0020_CountSubstrings countSubstrings = new _0020_CountSubstrings();
        int res = countSubstrings.countSubstrings(s);
        Assertions.assertEquals(6,res);
    }

    @Test
    public void  testisAlienSorted(){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        _0034_IsAlienSorted isAlienSorted = new _0034_IsAlienSorted();
        boolean res = isAlienSorted.isAlienSorted(words,order);
        Assertions.assertTrue(res);
    }

    @Test
    public void testFindMinDifference(){
        String[] timePoints = {"01:01","02:01","03:00"};
        _0035_FindMinDifference findMinDifference = new _0035_FindMinDifference();
        int res = findMinDifference.findMinDifference(Arrays.asList(timePoints));
        Assertions.assertEquals(59,res);
    }
    @Test
    public void testEvalRPN(){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        _0036_EvalRPN evalRPN = new _0036_EvalRPN();
        int res = evalRPN.evalRPN(tokens);
        Assertions.assertEquals(22,res);
    }
    @Test
    public void testAsteroidCollision(){
        int[] asteroids = {5,10,-5};
        _0037_AsteroidCollision asteroidCollision = new _0037_AsteroidCollision();
        int[] res = asteroidCollision.asteroidCollision(asteroids);
        Assertions.assertArrayEquals(new int[]{5,10},res);
    }
}
