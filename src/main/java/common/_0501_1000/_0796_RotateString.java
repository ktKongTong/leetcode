package common._0501_1000;

/**
 * @Title  旋转字符串
 * @Link   https://leetcode-cn.com/problems/rotate-string/
 * @Author KongTong
 * @Date 2022/4/7
 */
public class _0796_RotateString {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length()&&(A + A).contains(B);
    }
}
