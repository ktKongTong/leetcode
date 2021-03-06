package swordToOfferSA._0001_0020;

/**
 * @Title  字符串中的变位词
 * @Link   https://leetcode-cn.com/problems/MPnaiL/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0014_CheckInclusion {
    public boolean checkInclusion(String s1,String s2){
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < n; ++i) {
            --cnt[s1.charAt(i) - 'a'];
        }
        int left = 0;
        for (int right = 0; right < m; ++right) {
            int x = s2.charAt(right) - 'a';
            ++cnt[x];
            while (cnt[x] > 0) {
                --cnt[s2.charAt(left) - 'a'];
                ++left;
            }
            if (right - left + 1 == n) {
                return true;
            }
        }
        return false;
    }
}
