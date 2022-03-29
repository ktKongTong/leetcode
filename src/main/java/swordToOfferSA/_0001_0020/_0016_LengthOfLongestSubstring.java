package swordToOfferSA._0001_0020;

import java.util.ArrayList;
import java.util.List;

/*
* @Title  不含重复字符的最长子字符串
* @Link   https://leetcode-cn.com/problems/wtcaE1/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0016_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // 创建两个变量来控制滑动窗口的边界
        int left=0;
        int right;
        // 创建一个变量来记录最长的字串长度
        int maxlen=0;
        for(;left<s.length();left++){
            //  创建一个集合判断滑动窗口内是否有重复的字符
            List<Character> list= new ArrayList<>();
            // 不断移动有指针，并将其加入集合
            right=left;
            while(right<s.length()){
                if(!list.contains(s.charAt(right))){
                    list.add(s.charAt(right));
                }else{
                    break;
                }
                right++;
            }
            //   比较这次循环的最长子串
            if(right-left>maxlen){
                maxlen=right-left;
            }
        }
        return maxlen;
    }
}