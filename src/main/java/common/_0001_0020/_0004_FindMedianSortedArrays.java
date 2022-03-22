package common._0001_0020;

public class _0004_FindMedianSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m==0){
            return findMedian(nums2);
        }
        if(n==0){
            return findMedian(nums1);
        }
        int s = (m + n ) / 2;
        int startM = 0;
        int startN = 0;
        int flag = -1;
        while (startM + startN < s) {
            if(startM == m){
                startN++;
                flag = 0;
                continue;
            }
            if(startN == n){
                startM++;
                flag = 1;
                continue;
            }
            if (nums1[startM] < nums2[startN]) {
                startM++;
                flag = 1;
            }else if (nums1[startM] >= nums2[startN]) {
                startN++;
                flag = 0;
            }
        }
        // 中位数 前一位
        double pre = flag==0 ? nums2[startN - 1] : nums1[startM - 1];
        double next = Math.min(startM == m ? Double.MAX_VALUE : nums1[startM],
                startN == n ? Double.MAX_VALUE : nums2[startN]);
        return (m + n) % 2 == 1? next :(pre + next) / 2.0;
    }

    public  double findMedian(int[] nums){
        int len = nums.length;
        return (len %2 == 1) ? nums[len/2] : (nums[len/2 - 1] + nums[len/2])/2.0;
    }
}