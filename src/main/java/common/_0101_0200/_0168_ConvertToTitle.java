package common._0101_0200;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/9
 */
public class _0168_ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        // 26进制
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
