package swordToOfferSA._0001_0020;

public class _0005_MaxProduct{
    public int maxProduct(String[] words) {
        int[] wordsArray = new int[words.length];
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
