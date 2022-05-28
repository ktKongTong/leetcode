package common._0401_0500;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/20
 */
public class _0436_FindRightInterval {
    public int[] findRightInterval(int [][] intervals){
        if(intervals.length < 2){
            return new int[0];
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }
        int[] res = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(intervals[i][1]);
            res[i] = ceiling == null ? -1 : ceiling.getValue();
        }
        return res;
    }
}
