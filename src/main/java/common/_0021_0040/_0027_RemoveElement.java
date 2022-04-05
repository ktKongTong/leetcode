package common._0021_0040;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/23
 */
public class _0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                do {
                    if(i==len-- - 1){
                        return len;
                    }
                }while (nums[len] == val);
                nums[i] = nums[len];
            }
        }
        return len;
    }
}
