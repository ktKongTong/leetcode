package swordToOfferSA;
import org.junit.jupiter.api.*;
import swordToOfferSA._0001_0020.*;

import java.util.Arrays;

public class _0001_0005_Test {
    /*
     * 剑指offer 专项突击
     * 0001 整数除法
     * */
    @Test
    public void testDivide1() {
        _0001_Divide divide = new _0001_Divide();
        int res = divide.divide(-2147483648,4);
//        int res2 = divide.bitDivide(-2147483648,4);
        Assertions.assertEquals(-536870912, res);
//        Assertions.assertEquals(-536870912, res2);

    }
    /*
     * 剑指offer 专项突击
     * 0002 二进制加法
     * */
    @Test
    public  void testAddBinary(){
        _0002_AddBinary addBinary = new _0002_AddBinary();
        String res = addBinary.addBinary("1","111");
    }
    /*
     * 剑指offer 专项突击
     * 0003 前n个数字二进制中1的个数
     * */
    @Test
    public void testCountBits(){
        _0003_CountBits countBits = new _0003_CountBits();
        int[] res = countBits.countBits(5);
        System.out.println(Arrays.toString(res));
        int[] expect = {0,1,1,2,1,2};
        Assertions.assertArrayEquals(expect,res);
    }
    /*
     * 剑指offer 专项突击
     * 0004 只出现一次的数字
     * */
    @Test
    public void testSingleNumber(){
        _0004_SingleNumber singleNumber = new _0004_SingleNumber();
        int res = singleNumber.singleNumber(new int[]{4,4,2,4});
        System.out.println(res);
//        Assertions.assertEquals(6,res);
    }
    /*
     * 剑指offer 专项突击
     * 0005 单词长度的最大乘积
     * */
    @Test
    public void testMaxProduct(){
        _0005_MaxProduct maxProduct = new _0005_MaxProduct();
        String[] strings = new String[]{"eae","ea","aaf","bda","fcf","dc","ac","ce","cefde","dabae"};
        int res = maxProduct.maxProduct(strings);
        Assertions.assertEquals(15,res);
    }
}
