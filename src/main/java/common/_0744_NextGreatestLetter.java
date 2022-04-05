package common;

/**
 * @Title  寻找比目标字母大的最小字母
 * @Link   https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * @Author KongTong
 * @Date   2022/4/3
 */
public class _0744_NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }
}
