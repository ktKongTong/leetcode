package swordToOfferSA;

import org.junit.jupiter.api.*;
import swordToOfferSA._0021_0040.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author KongTong
 * @Date   2022/3/31
 */
public class _0031_0035_Test {
    // 0031 最近最少使用缓存
    @Test
    public void testLRUCache(){
        int capacity = 3;
        _0031_LRUCache lruCache = new _0031_LRUCache(capacity);
//        lruCache.get(3);
    }
    // 0032 有效的变位词
    @Test
    public void testIsAnagram(){
        String s = "";
        String t = "";
        _0032_IsAnagram isAnagram = new _0032_IsAnagram();
        boolean res = isAnagram.isAnagram(s,t);
        Assertions.assertEquals(true,res);
    }

    // 0033 变位词组
    @Test
    public void testGroupAnagrams(){
        String [] strs = {};
        _0033_GroupAnagrams groupAnagrams = new _0033_GroupAnagrams();
        List<List<String>> res = groupAnagrams.groupAnagrams(strs);

    }
    // 0034 外星语言是否排序
    @Test
    public void  testisAlienSorted(){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        _0034_IsAlienSorted isAlienSorted = new _0034_IsAlienSorted();
        boolean res = isAlienSorted.isAlienSorted(words,order);
        Assertions.assertTrue(res);
    }

    // 0035 最小时间差
    @Test
    public void testFindMinDifference(){
        String[] timePoints = {"01:01","02:01","03:00"};
        _0035_FindMinDifference findMinDifference = new _0035_FindMinDifference();
        int res = findMinDifference.findMinDifference(Arrays.asList(timePoints));
        Assertions.assertEquals(59,res);
    }
}
