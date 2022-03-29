package common;

/*
 * @Title  67.二进制求和
 * @Link   https://leetcode-cn.com/problems/add-binary/
 * @Author KongTong
 * @Date   2022/3/28
 */
public class _0067_AddBinary {
    public String addBinary(String a, String b) {
        // '1' 的ASCII码是49 因此 '1' & 1 = 1
        // '0' 的ASCII码是48 因此 '0' & 1 = 0
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int i = aArr.length - 1;
        int j = bArr.length - 1;
        int carry = 0;
        int res;
        StringBuilder sb = new StringBuilder();
        while (i>=0 && j>=0){
            // 该位结果
            carry = (carry + (aArr[i] & 1) + (bArr[j] & 1))>>1;
            sb.append(carry ^ (aArr[i] & 1) ^ (bArr[j] & 1));
            i--;
            j--;
        }
        while (i>=0){
            carry = carry & aArr[i] & 1;
            sb.append(carry ^ aArr[i] & 1);
            i--;
        }
        while (j>=0){
            carry = carry & bArr[j] & 1;
            sb.append(carry ^ bArr[j] & 1);
            j--;
        }
        if(carry == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
        /*
         * 1 1 1 1
         * 1 1 0 1
         * 1 0 1 1
         * 0 1 1 1
         * 1 0 0 0
         * 0 1 0 0
         * 0 0 1 0
         * 0 0 0 0
         * */
    }
}