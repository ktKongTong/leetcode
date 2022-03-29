package swordToOfferSA._0001_0020;

/*
* @Title  前 n 个数字二进制中 1 的个数
* @Link   https://leetcode-cn.com/problems/w3tCBm/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0003_CountBits {
    /*
    * 动态规划
    * 若n为偶数，则他的末位一定是0，此时二进制表示含有的 1 同 n/2
    * 若n为奇数，则他的末位一定是0，此时二进制表示含有的 1 同 相比 n - 1 多一个 1
    * */
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 1; i <= n; i++) {
            // i % 2 取余判断是否二进制的末位是0，因此等同位运算 i & 1
            res[i] = i % 2 == 0 ? res [i/2] : res[i-1] + 1;
        }
        return res;
    }
}
