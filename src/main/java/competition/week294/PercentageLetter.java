package competition.week294;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/22
 */
public class PercentageLetter {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return count * 100 / s.length();
    }
}
