package swordToOfferSA._0001_0020;

public class _0002_AddBinary {
    /*
     * 剑指offer II 题2
     * 思路:二进制加法 参考ALU加法器实现的优化方法，成组并联
     * */
    public String addBinary(String a, String b) {
        int max = Math.max(a.length(), b.length());
        String result = "";
        // 进位
        int carry = 0;
        for(int i = 0; i< max; i++){
            int m = i<a.length()?Integer.parseInt(String.valueOf(a.charAt(a.length()-1-i))):0;
            int n = i<b.length()?Integer.parseInt(String.valueOf(b.charAt(b.length()-1-i))):0;
            result = String.valueOf(m^n^carry).concat(result);
            carry = (m|n)&(m|carry)&(n|carry);
        }
        // 最后一个进位
        if(carry==1){
            result = "1".concat(result);
        }
        return result;
    }
}
