package swordToOfferSA._0001_0020;

/*
 * @Link https://leetcode-cn.com/problems/xoh6Oh/
 * @Title 整数除法
 * @Author KongTong
 * @Date 2022/03/15
 * */
public class _0001_Divide {
    /*
    * 思路:用减法实现的除法
    * */
    public int divide(int a,int b){
        int res = 0;
//        sign 为结果符号
        int sign = 1;
        // 除数为0
        if(b==0){
            return Integer.MAX_VALUE;
        }
        // 边界值处理
        if(a == Integer.MIN_VALUE&&b==-1){
            return Integer.MAX_VALUE;
        }
        if(a == Integer.MIN_VALUE){
            if(b>0){
                a = a + b;
            }else{
                a = a-b;
            }
            res = res +1;
        }
        if(a==0){
            return res;
        }
        if(a<0){
            a = -a;
            sign = -sign;
        }
        if(b<0){
            b = -b;
            sign = -sign;
        }
        // 余数
        a = a -b;
        //当除数大于0时，继续减少
        while (a>=0){
            res = res + 1;
            a = a -b;
        }
        return sign == 1 ? res : -res;
    }



    /*
    * 作者：tangweiqun
    * 思路：减法方法优化，每次减少一倍除数->尝试每次减少多倍的除数
    * 链接：https://leetcode-cn.com/problems/xoh6Oh/solution/jian-dan-yi-dong-javac-pythonjs-zheng-sh-e8r6/
    * 来源：力扣（LeetCode）
    * */
    public int betterDivide(int a,int b){
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;
        //结果符号，^ 异或运算，感叹大佬的熟练度
        int sign = (a > 0) ^ (b > 0) ? -1 : 1;
        // 向负取值(int 32bit表示范围为[-2^31,2^31-1],取负数不会溢出，再次感叹！！)
        if (a > 0) a = -a;
        if (b > 0) b = -b;
        int res = 0;
        while (a <= b) {
            int value = b;
            int k = 1;
            // 0xc0000000 是十进制 -2^30 的十六进制的表示
            // 判断 value >= 0xc0000000 的原因：保证 value + value 不会溢出
            // 可以这样判断的原因是：0xc0000000 是最小值 -2^31 的一半，
            // 而 a 的值不可能比 -2^31 还要小，所以 value 不可能比 0xc0000000 小
            // -2^31 / 2 = -2^30
            while (value >= 0xc0000000 && a <= value + value) {
                value += value;
                k += k;
            }
            a -= value;
            res += k;
        }
        return sign == 1 ? res : -res;
    }
    /*
     * 作者：tangweiqun
     * 思路：位运算实现的除法，与优化的除法方法是类似的，每次减少一倍除数->尝试每次减少多倍的除数
     *      从一倍开始尝试 -> 从可能的最高倍数开始尝试
     * 链接：https://leetcode-cn.com/problems/xoh6Oh/solution/jian-dan-yi-dong-javac-pythonjs-zheng-sh-e8r6/
     * 来源：力扣（LeetCode）
     * */

    // 时间复杂度：O(1)
    public int bitDivide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;
        int sign = (a > 0) ^ (b > 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            // 首先，右移的话，再怎么着也不会越界
            // 其次，无符号右移的目的是：将 -2147483648 看成 2147483648

            // 注意，这里不能是 (a >>> i) >= b 而应该是 (a >>> i) - b >= 0
            // 这个也是为了避免 b = -2147483648，如果 b = -2147483648
            // 那么 (a >>> i) >= b 永远为 true，但是 (a >>> i) - b >= 0 为 false
            if ((a >>> i) - b >= 0) { // a >= (b << i)
                a -= (b << i);
                res += (1 << i);
            }
        }
        return sign == 1 ? res : -res;
    }
}
