package competition.biweek75;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/2
 */
public class NumberOfWays {
    //超时TLE
    public long numberOfWays(String s){
        char[] chars = s.toCharArray();
        long count = 0;
        //010
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == '0') {
                count += choose2(i,'1', chars);
            }
        }
        //101
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == '1') {
                count += choose2(i,'0', chars);
            }
        }
        return count;
    }
    // 对每一个可选方案，返回可选的子组
    public long choose2(int index,char ch, char[] chars){
        long count = 0;
        for (int i = index + 1; i < chars.length - 1; i++) {
            if(chars[i] == ch){
                count += choose1(i,ch,chars);
            }
        }

        return count;
    }
    public long choose1(int index,char ch, char[] chars){
        long count = 0;
        for (int i = index + 1; i < chars.length; i++) {
            if(chars[i] != ch){
                count ++;
            }
        }
        return count;
    }
    public long reNumberOfWays(String s){
        char[] chars = s.toCharArray();
        long count = 0;
        long count1 = 0;
        long count0 = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '0'){
                count0++;
            }else {
                count1++;
            }
        }
        int left1 = 0;
        int left0 = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '0'){
                // 左边1 右边1
                count += left1 * (count1 - left1);
                left0++;
            }else{
                count += left0 * (count0 - left0);
                left1++;
            }
        }
        return count;
    }
}
