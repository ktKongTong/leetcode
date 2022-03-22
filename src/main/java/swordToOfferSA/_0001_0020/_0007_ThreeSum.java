package swordToOfferSA._0001_0020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0007_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3){
            return result;
        }
        // 排序
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        // 双指针
        for (int i = 0; i < nums.length-2; i++) {
            // 当前元素与上一个元素相同或者当前元素大于0就不用找了
            if((i>0&&nums[i] == nums[i-1])||nums[i]>0){
                continue;
            }
            // 从第一个元素开始起，寻找后面所有元素和为target的值
            int target = -nums[i];
            int minIndex = i+1;
            int j = nums.length -1;
            while(minIndex < j){
                if(nums[minIndex] + nums[j] > target){
                    j--;
                }
                else if(nums[minIndex] + nums[j] < target){
                    minIndex++;
                }
                else {
                    if(!result.isEmpty()){
                        if(!(nums[i] == result.get(result.size()-1).get(0) && nums[minIndex] == result.get(result.size()-1).get(1))){
                            result.add(Arrays.asList(nums[i],nums[minIndex], nums[j]));
                        }
                    }else {
                        result.add(Arrays.asList(nums[i],nums[minIndex], nums[j]));

                    }
                    minIndex++;
                }
            }
        }
        return result;
    }
}
