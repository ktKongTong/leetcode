package competition.doubleWeek75;

/**
 * @Title  转换数字的最少位翻转次数
 * @Link
 * @Author KongTong
 * @Date   2022/4/2
 */
public class MinBitFlips {
    public int minBitFlips(int start,int goal) {
        start ^= goal;
        int count = 0;
        while (start != 0) {
            if ((start & 1) == 1) {
                count++;
            }
            start >>= 1;
        }
        return count;
    }
}
