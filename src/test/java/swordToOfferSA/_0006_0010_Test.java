package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0001_0020.*;

import java.util.Arrays;
import java.util.List;

public class _0006_0010_Test {
    // 0006 排序数组中两个数字之和
    @Test
    public void testTwoSum(){
        _0006_TwoSum twoSum = new _0006_TwoSum();
        int [] numbers = new int[]{1,2,4,6,10};
        int[] res = twoSum.twoSum(numbers,8);
        System.out.println(Arrays.toString(res));
        int[] expect = new int[]{1,3};
        Assertions.assertArrayEquals(res,expect);
    }
    // 0007 数组中和为0的三个数
    @Test
    public void  testThreeSum(){
        _0007_ThreeSum threeSum = new _0007_ThreeSum();
        int [] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum.threeSum(nums);
        Assertions.assertEquals("[[-1, -1, 2], [-1, 0, 1]]",res.toString());
    }
    // 0008 和大于等于target的最短子数组
    @Test
    public void testMinSubArrayLen(){
        _0008_MinSubArrayLen minSubArrayLen = new _0008_MinSubArrayLen();
        int res = minSubArrayLen.minSubArrayLen(7,new int[]{2,3,1,2,4,3});
        Assertions.assertEquals(2,res);
    }
    // 0009 乘积小于k的子数组
    @Test
    public void  testMumSubarrayProductLessThanK(){
        _0009_MumSubarrayProductLessThanK mumSubarrayProductLessThanK = new _0009_MumSubarrayProductLessThanK();
        int [] nums = new int[]{10,5,2,6};
        int res = mumSubarrayProductLessThanK.dpNumSubarrayProductLessThanK(nums,100);
        Assertions.assertEquals(8,res);
    }
    // 0010 和为k的子数组
    @Test
    public void testSubarraySum(){
        _0010_SubarraySum subarraySum = new _0010_SubarraySum();
        int [] nums = new int[]{};
        int res = subarraySum.subarraySum(nums,2);
        Assertions.assertEquals(0,res);
    }
}
