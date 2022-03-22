package common;

/*
 * @Author KongTong
 * @Link https://leetcode-cn.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
 * @Title 2038. 如果相邻两个颜色均相同则删除当前颜色
 * @Date 2022/3/22
 */
public class _2038_WinnerOfGame {
    public boolean winnerOfGame(String colors) {
        int count = 0;
        char pre;
        char cur = 'C';
        char next = 'C';
        for (char c : colors.toCharArray()){
            pre = cur;
            cur = next;
            next = c;
            if (pre == cur && next == cur){
                count += c== 'A' ? 1 : -1;
            }
        }
        return count > 0;
    }
}
