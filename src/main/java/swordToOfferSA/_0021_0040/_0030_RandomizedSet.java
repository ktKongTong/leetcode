package swordToOfferSA._0021_0040;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class _0030_RandomizedSet {
    private final ArrayList<Integer> list;
    private final HashMap<Integer, Integer> map;
    private final Random random;
    public _0030_RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int insteadIndex = list.size()- 1;
        int index= map.get(val);
        if(insteadIndex == index){
            list.remove(index);
            map.remove(val);
            return true;
        }
        int instead = list.get(insteadIndex);
        list.set(index, instead);
        map.replace(instead, index);
        map.remove(val);
        list.remove(insteadIndex);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(0,list.size()));
    }
}
