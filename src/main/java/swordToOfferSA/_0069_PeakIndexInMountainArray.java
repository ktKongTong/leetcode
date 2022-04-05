package swordToOfferSA;

/**
 * @Title  山峰数组的顶部
 * @Link   https://leetcode-cn.com/problems/B1IidL/
 * @Author KongTong
 * @Date   2022/3/20
 */
public class _0069_PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length && arr[j] > arr[i]) {
            i++;
            j++;
        }
        return i;
    }
}
