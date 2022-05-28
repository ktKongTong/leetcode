package common.face;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/27
 */
public class _17_11_FindClosest {
    private final Map<String, List<Integer>> map = new HashMap<>();
    public int findClosest(String[] words, String word1, String word2) {
        for (int i = 0; i < words.length; i++) {
            if(map.get(words[i])!=null){
                map.get(words[i]).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(words[i], list);
            }
        }
        List<Integer> indexList1 = map.get(word1);
        List<Integer> indexList2 = map.get(word2);
        if(indexList1==null||indexList2==null){
            return -1;
        }
        int res = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while(i<indexList1.size() && j<indexList2.size()){
            res = Math.min(res, Math.abs(indexList2.get(j) - indexList1.get(i)));
            if(indexList1.get(i) < indexList2.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return res;
    }
}
