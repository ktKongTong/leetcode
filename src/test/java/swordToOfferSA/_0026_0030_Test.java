package swordToOfferSA;

import ds.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0041_0060._0021_0040._0043_CBTInserter;

public class _0026_0030_Test {
    @Test
    public void testCBTInserter(){
        TreeNode root = new TreeNode(1);
//        root.left = new swordToOffer.CBTInserter.TreeNode(2);
//        root.right = new swordToOffer.CBTInserter.TreeNode(3);
//        root.left.left = new swordToOffer.CBTInserter.TreeNode(4);
//        root.left.right = new swordToOffer.CBTInserter.TreeNode(5);
        _0043_CBTInserter cbtInserter = new _0043_CBTInserter(root);
        int res = cbtInserter.insert(2);
        Assertions.assertEquals(1,res);
    }
}
