package competition.biweek78;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/14
 */
public class DivisorSubstrings {
    public int divisorSubstrings(int num,int k){
        String str = String.valueOf(num);
        int res = 0;
        for (int i = 0; i < str.length()-k+1; i++) {
            String sub = str.substring(i,k+i);
            // 判断能够整除
            int value = Integer.parseInt(sub);
            if(value != 0 && num % value==0){
                res++;
            }
        }
        return res;
    }
}
