package swordToOfferSA._0021_0040;

public class _0032_IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.compareTo(t) == 0) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        int sums = 0;
        for (int i = 0; i < 26; i++) {
            sums += Math.abs(count[i]);
        }
        return sums == 0;
    }
//        if(s.length() != t.length()) return false;
//        int[] count = new int[26];
//        for(int i = 0; i < s.length(); i++){
//            count[s.charAt(i) - 'a']++;
//        }
//        for(int i = 0; i < t.length(); i++){
//            count[t.charAt(i) - 'a']--;
//        }
//        for(int i = 0; i < 26; i++){
//            if(count[i] != 0) return false;
//        }
//        return true;

}