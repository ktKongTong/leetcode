package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0001_0020.*;

public class _0016_0020_Test {
    // 0016 不含重复字符的最长子字符串
    @Test
    public void testLengthOfLongestSubstring(){
        String s = "abcabcbb";
        _0016_LengthOfLongestSubstring lengthOfLongestSubString = new _0016_LengthOfLongestSubstring();
        int res = lengthOfLongestSubString.lengthOfLongestSubstring(s);
        Assertions.assertEquals(3,res);
    }
    // 0017 含有所有字符的最短字符串
    @Test
    public void testMinWindow(){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        _0017_MinWindow minWindow = new _0017_MinWindow();
        String res = minWindow.minWindow(s,t);
        Assertions.assertEquals("BANC",res);
    }
    // 0018 有效的回文
    @Test
    public void testIsPalindrome(){
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        _0018_IsPalindrome isPalindrome = new _0018_IsPalindrome();
        boolean res = isPalindrome.doublePointIsPalindrome(s);
//        Assertions.assertTrue(res);
        Assertions.assertFalse(res);
    }
    // 0019 最多删除一个字符得到回文
    @Test
    public void testValidPalindrome() {
        String s = "aba";
        _0019_ValidPalindrome validPalindrome = new _0019_ValidPalindrome();
        boolean res = validPalindrome.validPalindrome(s);
        Assertions.assertTrue(res);
    }
    // 0020 回文字符串的个数
    @Test
    public void testCountSubstrings(){
        String s = "abc";
        _0020_CountSubstrings countSubstrings = new _0020_CountSubstrings();
        int res = countSubstrings.countSubstrings(s);
        Assertions.assertEquals(3,res);
    }
}
