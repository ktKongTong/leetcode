package swordToOfferSA._0001_0020;

/**
 * @Title  有效的回文
 * @Link   https://leetcode-cn.com/problems/XltzEq/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0018_IsPalindrome {
    public boolean isPalindrome(String s) {
        //筛选
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length()/2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    // 双指针
    public boolean doublePointIsPalindrome(String s) {
        //筛选
        int i = 0, j = s.length()-1;
        s = s.toLowerCase();
        while(i<j) {
            while (!Character.isLetterOrDigit(s.charAt(i))&&i<j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))&&i<j) {
                j--;
            }
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}