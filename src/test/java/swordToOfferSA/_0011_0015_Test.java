package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0001_0020.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0011_0015_Test {
    // 0011 0和 1个数相同的子数组
    @Test
    public void testFindMaxLength(){
        _0011_FindMaxLength findMaxLength = new _0011_FindMaxLength();
        int [] nums = new int[]{0,1};
        int res = findMaxLength.findMaxLength(nums);
        Assertions.assertEquals(2,res);
    }
    // 0012 左右两边子数组和相等
    @Test
    public void testPivotIndex(){
        _0012_PivotIndex pivotIndex = new _0012_PivotIndex();
        int [] nums = new int[]{2,1,-1};
        int res = pivotIndex.pivotIndex(nums);
        Assertions.assertEquals(0,res);
    }
    // 0013 二维子矩阵的和
    @Test
    public void  testNumMatrix(){
        int [][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},
                {4,1,0,1,7},{1,0,3,0,5}};
        _0013_NumMatrix numMatrix = new _0013_NumMatrix(matrix);
        int res1 = numMatrix.sumRegion(2,1,4,3);
        int res2 = numMatrix.sumRegion(1,1,2,2);
        int res3 = numMatrix.sumRegion(1,2,2,4);
        Assertions.assertEquals(8,res1);
        Assertions.assertEquals(11,res2);
        Assertions.assertEquals(12,res3);
    }
    // 0014 字符串中的变位词
    @Test
    public void testCheckInclusion(){
        String s1 = "ab";
        String s2 = "eidbaooo";
        _0014_CheckInclusion checkInclusion = new _0014_CheckInclusion();
        boolean res = checkInclusion.checkInclusion(s1,s2);
        Assertions.assertTrue(res);
    }
    // 0015 字符串中的所有变位词
    @Test
    public void testFindAnagrams(){
        String s = "cbaebabacd";
        String p = "abc";
        _0015_FindAnagrams findAnagrams = new _0015_FindAnagrams();
        List<Integer> res = findAnagrams.findAnagrams(s,p);
        List<Integer> expect = new ArrayList<>();
        expect.add(0);
        expect.add(6);
        Assertions.assertEquals(expect,res);
    }
}
