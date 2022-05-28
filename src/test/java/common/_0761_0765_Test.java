package common;

import common._0501_1000._0762_CountPrimeSetBits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author KongTong
 * @Date 2022/4/5
 */
public class _0761_0765_Test {

    @Test
    public void testHasAlternatingBits() {
        _0762_CountPrimeSetBits countPrimeSetBits = new _0762_CountPrimeSetBits();
        int res = countPrimeSetBits.countPrimeSetBits(10, 15);
        Assertions.assertEquals(2,res);
    }
}
