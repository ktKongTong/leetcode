package common;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/23
 */
public class _0009_IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        char[] arr = String.valueOf(x).toCharArray();
        for (int i = 0, j = arr.length-1; i < arr.length/2; i++,j--) {
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
}
