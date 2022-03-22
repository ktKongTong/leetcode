package swordToOfferSA;

import org.junit.jupiter.api.Test;
import swordToOfferSA._0041_0060._0059_KthLargest;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/16
 */
public class _0056_0060_Test {
    @Test
    public void testKthLargest(){
        int k = 3;
        int[] arr = {4,5,8,2};
        _0059_KthLargest kthLargest = new _0059_KthLargest(k,arr);
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(4);
//        System.out.println(result);
    }
}
