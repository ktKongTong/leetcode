package common._0501_1000;

import java.util.ArrayList;
import java.util.List;
/**
 * @Title  自除数
 * @Link   https://leetcode-cn.com/problems/self-dividing-numbers/
 * @Author KongTong
 * @Date   2022/3/31
 */
public class _0728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }
    public boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
