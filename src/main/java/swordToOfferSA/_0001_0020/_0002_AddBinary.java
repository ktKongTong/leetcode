package swordToOfferSA._0001_0020;

/*
* @Title  二进制加法
* @Link   https://leetcode-cn.com/problems/JFETK5/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0002_AddBinary {
    /*
     * 剑指offer II 题2
     * 思路:二进制加法
     * 此时
     * */
    public String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        // 进位
        int carry = 0;
        for(int i = 0; i< Math.max(a.length(), b.length()); i++){
            // '1' 的ASCII码是49 因此 '1' & 1 = 1
            // '0' 的ASCII码是48 因此 '0' & 1 = 0
            int m = i<a.length() ? aArr[a.length() - 1 - i] & 1 : 0;
            int n = i<b.length() ? bArr[b.length() - 1 - i] & 1 : 0;
            // m         1  1  0  0  1  1  0  0
            // n         1  0  1  0  1  0  1  0
            // carry     1  1  1  1  0  0  0  0
            // m | n     1  1  1  0  1  1  1  0
            // m | carry 1  1  1  1  1  1  0  0
            // n | carry 1  1  1  1  1  0  1  0
            //           1  1  1  0  1  0  0  0
            // (m | n) & (m | carry) & (n | carry)
            carry = (m | n) & (m | carry) & (n | carry);
            sb.append(m ^ n ^ carry);
        }
        // 最后一个进位
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
