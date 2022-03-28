package common;

import common._0001_0020._0004_FindMedianSortedArrays;
import common._0001_0020._0013_RomanToInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/24
 */
public class _0011_0015_Test {
    @Test
    public void testFindMedianSortedArrays(){
        _0013_RomanToInt romanToInt = new _0013_RomanToInt();
        int res = romanToInt.romanToInt("MCMXCIV");
        Assertions.assertEquals(res, 1994);
    }
}
