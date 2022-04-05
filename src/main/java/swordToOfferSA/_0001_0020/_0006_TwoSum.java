package swordToOfferSA._0001_0020;
/**
 * @Title  排序数组中两个之和
 * @Link   https://leetcode-cn.com/problems/kLl5u1/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0006_TwoSum{
    /*
    * 双指针
    * 两边逼近
    * */
    public int[] twoSum(int[] numbers,int target){
        int i = 0, j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] > target) {
                j--;
            }else if(numbers[i] + numbers[j] < target) {
                i++;
            }else {
                return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }
}
