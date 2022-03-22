package swordToOfferSA;

/*
 * @Author KongTong
 * @Link https://leetcode-cn.com/problems/0H97ZC/
 * @Title 剑指 Offer II 075. 数组相对排序
 * @Date 2022/3/20
 */
public class _0075_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                arr[index++] = arr2[i];
                count[arr2[i]]--;
            }
        }
        for (int i = 0; i < 1001; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
        return arr;
    }
}
