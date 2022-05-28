package competition;

import competition.biweek78.WaysToSplitArray;
import org.junit.jupiter.api.Test;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/14
 */
public class BiWeek78 {
    @Test
    public void testWaysToSplitArray(){
        WaysToSplitArray waysToSplitArray = new WaysToSplitArray();
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int res = waysToSplitArray.waysToSplitArray(nums);
    }
//    @Test
//    public void testMaximumWhiteTiles(){
//        MaximumWhiteTiles maximumWhiteTiles = new MaximumWhiteTiles();
//        int [][] tiles = {{10,11},{1,5},{12,18},{20,25},{30,32}};
//        int carpetLen = 10;
//        int res = maximumWhiteTiles.maximumWhiteTiles(tiles,carpetLen);
//        Assertions.assertEquals(9,res);
//    }
}
