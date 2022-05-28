package common._0401_0500;

import java.util.Arrays;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/23
 */
public class _0440_FindKthNumber {
    public int findKthNumber(int n, int k) {
        //todo
        return 1;
//        int i = n;
//        int level = 0;
//        double count = 0;
//        while (i >= 1) {
//            count = count + Math.pow(10, level);
//            level++;
//            i /= 10;
//        }
//        System.out.println(count);
//        return 1;
        /*
        在 10^0 数量级 1个
        1 2 3 4 5 6 7 8 9
        在 10^1 数量级 10个
        10 11 12 13 14 15 16 17 18 19
        在 10^2 数量级 100个
        100 101 102 103 104 105 106 107 108 109 …… 199
        在 10^3 数量级 1000个
        1000 1001 1002 1003 1004 1005 1006 1007 1008 1009 …… 1999
        ……
         */
        /*
        2
        20 21 22 23 24 25 26 27 28 29
        200 201 202 203 204 205 206 207 208 209 …… 299

        2  1
        20 1
        200 201 202 203 204 205 206 207 208 209 10
        2000 2001 2002 2003 2004 2005 2006 2007 2008 2009 …… 2099 100

        20000 20001 20002 20003 20004 20005 20006 20007 20008 20009
        20010 20011 20012 20013 20014 20015 20016 20017 20018 20019

        2020 2021 2022 2023 2024 2025 2026 2027 2028 2029

        * */

//        String[] res = new String[n];
//        for(int i = 0; i < n; i++) {
//            res[i] = String.valueOf(i + 1);
//        }
//        Arrays.sort(res);
//        return Integer.parseInt(res[k - 1]);
    }
}
