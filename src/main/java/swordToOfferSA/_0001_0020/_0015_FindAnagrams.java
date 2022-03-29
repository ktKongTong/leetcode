package swordToOfferSA._0001_0020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* @Title  字符串中的所有变位词
* @Link   https://leetcode-cn.com/problems/VabMRr/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0015_FindAnagrams {
    public List<Integer> findAnagrams(String s, String p){
        // m为长串长度
        // s为长串，p为短串
        int n = p.length(), m = s.length();
        List<Integer> res = new ArrayList<>();
        if(m<n){
            return res;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[p.charAt(i) - 'a'];
            ++cnt2[s.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            res.add(0);
        }
        for (int i = n; i < m; ++i) {
            ++cnt2[s.charAt(i) - 'a'];
            --cnt2[s.charAt(i - n) - 'a'];
            if (Arrays.equals(cnt1, cnt2)) {
                res.add(i - n + 1);
            }
        }
        return res;
    }
}