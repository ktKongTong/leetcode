package common;

import java.util.Arrays;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/27
 */
public class _0088_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        if(m==0){
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int [] temp = Arrays.copyOf(nums1,m);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n){
            if(temp[i]<=nums2[j]){
                nums1[k] = temp[i];
                i++;
            }else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k] = temp[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }
}
