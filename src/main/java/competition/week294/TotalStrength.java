package competition.week294;

import java.util.HashMap;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/22
 */
public class TotalStrength {


    public int totalStrength(int[] strength) {
        int n = strength.length;
        int [] dpMin = new int[n*(n+1)/2];
        // 前缀和
        int [] preSum = new int[n+1];
        preSum[0] = 0;
        for (int i = 1; i < n+1; i++) {
            preSum[i] = strength[i-1] + preSum[i-1];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    // 单元素
                    int index = i*n-i*(i-1)/2;
                    dpMin[index] = strength[i];
                    sum = (sum + strength[i]*strength[i])%1000000007;
                } else if(i < j) {
                    // 起i,终j
                    int index = i*n-i*(i-1)/2 + j - i;
                    dpMin[index] = Math.min(dpMin[index - 1], strength[j]);
                    int partSum = preSum[j+1] - preSum[i];
                    sum = (sum + dpMin[index]*partSum)%1000000007;
                }
            }
        }
        return sum;
    }
}

