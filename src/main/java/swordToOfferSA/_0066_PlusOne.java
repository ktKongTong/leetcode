package swordToOfferSA;

import java.util.Arrays;

/**
 * @Title
 * @Link   
 * @Author KongTong
 * @Date   2022/3/26
 */
public class _0066_PlusOne {
    public int[] plusOne(int[] digits) {
        int l = digits.length - 1;
        while (l>=0 && digits[l] == 9) {
            digits[l] = 0;
            l--;
        }
        if(l != -1) {
            digits[l]++;
        }else{
            int[] res = new int[digits.length + 1];
            Arrays.fill(res, 0);
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
