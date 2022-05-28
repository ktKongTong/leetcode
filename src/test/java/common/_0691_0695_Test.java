package common;

import common._0501_1000._0693_HasAlternatingBits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _0691_0695_Test {
    @Test
    public void testHasAlternatingBits() {
        _0693_HasAlternatingBits s = new _0693_HasAlternatingBits();
        boolean res = s.hasAlternatingBits(7);
        Assertions.assertFalse(res);
    }
}
