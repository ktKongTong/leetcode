package common;

import org.junit.jupiter.api.Test;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/16
 */
public class _0431_0435_Test {
    @Test
    public void testAllOne() {
        _0432_AllOne allOne = new _0432_AllOne();
        allOne.inc("hello");
        allOne.inc("goodbye");
        allOne.inc("hello");
        allOne.inc("hello");
        System.out.println(allOne.getMaxKey());
        allOne.inc("leet");
        allOne.inc("code");
        allOne.inc("leet");
        allOne.dec("hello");
        allOne.inc("leet");
        allOne.inc("code");
        allOne.inc("code");
        System.out.println(allOne.getMaxKey());
    }
    @Test
    public void testAllOne1() {
        _0432_AllOne allOne = new _0432_AllOne();
        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.dec("b");
        allOne.dec("b");
        System.out.println(allOne.getMinKey());
        allOne.dec("a");
        System.out.println(allOne.getMaxKey());
        System.out.println(allOne.getMinKey());
    }
}
