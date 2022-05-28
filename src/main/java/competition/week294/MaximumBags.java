package competition.week294;

import java.util.Arrays;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/22
 */
public class MaximumBags {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remain = new int[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            remain[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(remain);

        for (int i = 0; i < remain.length; i++) {
            if(additionalRocks>=remain[i]) {
                additionalRocks -= remain[i];
            }else{
                return i;
            }
        }
        return remain.length;
    }
}
