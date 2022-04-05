package swordToOfferSA._0021_0040;

/**
 * @Title  有效的变位词
 * @Link   https://leetcode-cn.com/problems/dKk3P7/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0032_IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.compareTo(t) == 0) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        int sums = 0;
        for (int i = 0; i < 26; i++) {
            sums += Math.abs(count[i]);
        }
        return sums == 0;
    }
}