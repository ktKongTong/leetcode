package swordToOfferSA;

/**
 * @Title  求平方根
 * @Link   https://leetcode-cn.com/problems/jJ0w9p/
 * @Author KongTong
 * @Date   2022/3/21
 */
public class _0072_MySqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) return mid;
                left = mid + 1;
            }
        }
        return right;
    }
}
