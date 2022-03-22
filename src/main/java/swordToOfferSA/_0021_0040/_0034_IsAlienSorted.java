package swordToOfferSA._0021_0040;

public class _0034_IsAlienSorted {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length <= 1){
            return true;
        }
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        String prev = words[0];
        String next = words[1];
        for (int i = 0; i < words.length-1; i++) {
            if(!compare(prev, next, orderMap)){
                return false;
            }
            prev = next;
            next = words[i+1];
        }
        return true;
    }
    //prev < next?
    public boolean compare(String prev, String next, int[] orderMap){

        for (int i = 0; i < Math.min(prev.length(),next.length()); i++) {
            if(orderMap[prev.charAt(i) - 'a'] < orderMap[next.charAt(i) - 'a']){
                return true;
            }else if(orderMap[prev.charAt(i) - 'a'] > orderMap[next.charAt(i) - 'a']){
                return false;
            }
        }
        return prev.length() <= next.length();
    }
}