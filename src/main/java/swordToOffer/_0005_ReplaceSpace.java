package swordToOffer;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/3/22
 */
public class _0005_ReplaceSpace {
    public String replaceSpace(String s){
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
