package swordToOfferSA._0001_0020;

public class _0019_ValidPalindrome {
    public boolean validPalindrome(String s) {
        int count = 2;
        int i = 0;
        int j = s.length() - 1;
        int memi = 0;
        int memj = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (count == 2) {
                    count--;
                    memi = i++;
                    memj = j;
                    continue;
                }else if (count == 1) {
                    count--;
                    i = memi;
                    j = --memj;
                    continue;
                }else {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}