package swordToOfferSA._0021_0040;

import java.util.Arrays;
import java.util.List;

public class _0035_FindMinDifference {
    public int findMinDifference(List<String> timePoints) {
        int [] times = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++){
            String[] split = timePoints.get(i).split(":");
            int hour = Integer.parseInt(split[0]);
            int minute = Integer.parseInt(split[1]);
            times[i] = 60 * hour + minute;
//            times[i] = convertTimePointToInt(timePoints.get(i));
        }
        Arrays.sort(times);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < times.length-1; i++){
            minDiff = Math.min(minDiff, times[i+1] - times[i]);
        }
        minDiff = Math.min(minDiff, 1440 - times[times.length-1] + times[0]);
        return minDiff;
    }
    public int convertTimePointToInt(String timePoint){
        String [] time = timePoint.split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        return hour * 60 + minute;
    }
}