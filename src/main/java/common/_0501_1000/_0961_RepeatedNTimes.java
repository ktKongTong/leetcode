package common._0501_1000;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/21
 */
public class _0961_RepeatedNTimes {
//    private final HashMap<Integer, Integer> map = new HashMap<>();
    public int repeatedNTimes(int[] nums) {
        int[] res = new int[10001];
        for (int num : nums) {
            if(res[num] == 0) {
                res[num] = 1;
            } else {
                return num;
            }
        }
        return 0;
    }

    public void test() {
        int[] nums = {1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
}
