package common;

import java.util.Arrays;

/*
 * @Author KongTong
 * @Link https://leetcode-cn.com/problems/longest-word-in-dictionary/
 * @Title
 * @Date 2022/3/17
 */
//todo
public class _0720_LongestWord {
    public String longestWord(String[] words) {
        Arrays.sort(words ,(a, b) -> a.length() - b.length());
        return "";
    }
}
