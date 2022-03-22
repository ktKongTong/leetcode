package swordToOfferSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0001_0020._0016_LengthOfLongestSubstring;
import swordToOfferSA._0001_0020._0017_MinWindow;
import swordToOfferSA._0001_0020._0018_IsPalindrome;
import swordToOfferSA._0001_0020._0019_ValidPalindrome;

public class _0016_0020_Test {
    @Test
    public void testLengthOfLongestSubstring(){
        String s = "abcabcbb";
        _0016_LengthOfLongestSubstring lengthOfLongestSubString = new _0016_LengthOfLongestSubstring();
        int res = lengthOfLongestSubString.lengthOfLongestSubstring(s);
        Assertions.assertEquals(3,res);
    }
    @Test
    public void testMinWindow(){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        _0017_MinWindow minWindow = new _0017_MinWindow();
        String res = minWindow.minWindow(s,t);
        Assertions.assertEquals("BANC",res);
    }
    @Test
    public void testIsPalindrome(){
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        _0018_IsPalindrome isPalindrome = new _0018_IsPalindrome();
        boolean res = isPalindrome.doublePointIsPalindrome(s);
//        Assertions.assertTrue(res);
        Assertions.assertEquals(false,res);
    }
    @Test
    public void testValidPalindrome() {
        String s = "aba";
        _0019_ValidPalindrome validPalindrome = new _0019_ValidPalindrome();
        boolean res = validPalindrome.validPalindrome(s);
        Assertions.assertEquals(true, res);
    }
}
