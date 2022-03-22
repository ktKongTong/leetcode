package swordToOfferSA._0021_0040;

import java.util.*;

public class _0033_GroupAnagrams {
    // todo
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        // 建立哈希表<排序后字符串, res 的下标索引>
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            // 获取排序后字符串
            String key = new String(c);
            // 如果map中存在
            if(map.containsKey(key)){
                // 获取res的下标,并将字符串添加
                int index = map.get(key);
                res.get(index).add(s);
            }else{
                // 不存在,则创建
                map.put(key, res.size());
                List<String> ans = new ArrayList<>();
                ans.add(s);
                res.add(ans);
            }
        }
        return res;
    }
}
