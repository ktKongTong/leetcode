package swordToOfferSA._0001_0020;
/**
 * @Title  单词长度的最大乘积
 * @Link   https://leetcode-cn.com/problems/aseY1I/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0005_MaxProduct{
    //
    public int maxProduct(String[] words) {
        int[] wordsArray = new int[words.length];

        /*
        * 1 << (letter - 'a')
        * 映射，将一个单词中的字母转换为32bit中的一个位
        * 1 << ('b' - 'a') = 1 << 1 = 2，其二进制表示 0010
        * wordsArray[i] = 1 << (letter - 'a') | wordsArray[i]
        * 将该单词的所有字母映射到32位中的一位，对应位为 1 时表明该单词内存在对应字母，否则为 0
        * 判断两个单词是否存在重复字母，即可通过映射计算出来的两个数
        * 进行 求 & 操作，如果 & 为 0，则表明两个单词没有重复字母
        * */
        for (int i = 0, end = words.length; i < end; i++) {
            for (char letter : words[i].toCharArray()) {
                wordsArray[i] |= (1 << (letter - 'a'));
            }
        }
        int product = 0;
        for (int i = 0, end = words.length; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if ((wordsArray[i] & wordsArray[j]) == 0) {
                    product = Math.max(product, words[i].length() * words[j].length());
                }
            }
        }
        return product;
    }
}
