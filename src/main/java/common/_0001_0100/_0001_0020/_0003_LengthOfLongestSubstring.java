package common._0001_0100._0001_0020;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/5
 */
public class _0003_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        int len = s.length();
        int[] map = new int[256];
        while (end < len) {
            char c = s.charAt(end);
            if (map[c] == 0) {
                map[c] = 1;
                end++;
                max = Math.max(max, end - start);
            } else {
                map[s.charAt(start)] = 0;
                start++;
            }
        }
        return max;
    }
}
