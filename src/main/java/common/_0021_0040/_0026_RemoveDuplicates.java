package common._0021_0040;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/23
 */
public class _0026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int pre = 0;
        int cur = 1;
        while(cur < nums.length){
            if(nums[pre] != nums[cur]){
                nums[++pre] = nums[cur];
            }
            cur++;
        }
        return pre + 1;
    }
}
