package swordToOfferSA._0001_0020;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title  含有所有字符的最短字符串
 * @Link   https://leetcode-cn.com/problems/M1oyTv/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0017_MinWindow {
    public String minWindow(String s1, String s2) {
        int l = 0, r = 0;
        int len = s1.length();
        //统计要匹配的字符串字符出现的次数
        Map<Character, Integer> cnt2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            cnt2.put(s2.charAt(i), cnt2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        //记录窗口内字符出现次数
        Map<Character, Integer> cnt = new HashMap<>();
        String ans = "";
        while (l <= r && r < len) {
            //窗口扩大，将右侧字符计数
            cnt.put(s1.charAt(r), cnt.getOrDefault(s1.charAt(r), 0) + 1);
            while (match(cnt, cnt2)) {
                //找到匹配字符串，开始讲窗口向右滑动，左边字符计数-1
                if (ans.length() == 0 || (r - l) < ans.length()) {
                    ans = s1.substring(l, r + 1);
                }
                cnt.put(s1.charAt(l), cnt.getOrDefault(s1.charAt(l), 0) - 1);
                l++;
            }
            r++;
        }
        return ans;
    }

    private boolean match(Map<Character, Integer> cnt, Map<Character, Integer> cnt2) {
        for (Map.Entry<Character, Integer> characterIntegerEntry : cnt2.entrySet()) {
            Character key = characterIntegerEntry.getKey();
            if (cnt.getOrDefault(key, 0) < characterIntegerEntry.getValue()) {
                return false;
            }
        }
        return true;
    }

}