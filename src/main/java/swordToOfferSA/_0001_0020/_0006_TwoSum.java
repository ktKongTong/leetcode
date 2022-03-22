package swordToOfferSA._0001_0020;

public class _0006_TwoSum{
    public int[] twoSum(int[] numbers,int target){
            int i = 0, j = numbers.length - 1;
            while(i < j){
                if(numbers[i] + numbers[j] > target) j--;
                else if(numbers[i] + numbers[j] < target) i++;
                else return new int[]{i, j};
            }
            return new int[]{0, 0};
    }
}
