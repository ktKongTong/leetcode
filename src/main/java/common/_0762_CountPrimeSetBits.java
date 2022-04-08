package common;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/5
 */
public class _0762_CountPrimeSetBits {
    // 1<left,right<10^6，因此高12位必为0
    private final HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            int k = i;
            int count = 0;
            while (k > 0) {
                if(k % 2 == 1) {
                    count++;
                }
                k >>= 1;
            }
            if (set.contains(count)) {
                res++;
            }
        }
        return res;
    }
}
