package competition.doubleWeek75;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/2
 */
public class SumScores {
    // TLE超时
    public long sumScores(String s){
        if(s.length() == 1){
            return 1;
        }
        long sum = s.length();
        //build
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(i);
            long sc = getScore(s, s1);
            sum += sc;
            if(sc == s1.length()){
                sum += sumScores(s1);
                break;
            }
        }
        return sum;
    }
    public long getScore(String parent, String sub){
        long score = 0;
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == parent.charAt(i)){
                score++;
            }else {
                break;
            }
        }
        return score;
    }
    //
    public long reSumScores(String s){
        if(s.length() == 1){
            return 1;
        }
        long sum = s.length();
        for (int i = 1; i < s.length(); i++) {
            sum += getScore(s, s.substring(i));
        }
        return sum;
    }
}
