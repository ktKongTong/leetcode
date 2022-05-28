package common._2001_3000;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/27
 */
public class _2028_MissingRolls {
    public int[] missingRolls(int[] rolls, int mean,int n) {
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }
        sum = mean*(rolls.length+n) - sum;
        if(6*n<sum||sum<n) {
            return new int[0];
        }
        int quotient = sum / n, remainder = sum % n;
        int[] missing = new int[n];
        for (int i = 0; i < n; i++) {
            missing[i] = quotient + (i < remainder ? 1 : 0);
        }
        return missing;
    }
}
