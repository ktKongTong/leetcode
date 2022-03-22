package swordToOfferSA._0001_0020;

public class _0020_CountSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }


    public static boolean isPalindrome(String s) {
        //筛选
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length()/2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}