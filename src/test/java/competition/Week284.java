package competition;

import competition.week284.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Week284 {
    @Test
    public void testFindKDistantIndices(){
        int [] nums = {3,4,9,1,3,9,5};
        int key = 9;
        int k = 1;
        FindKDistantIndices findKDistantIndices = new FindKDistantIndices();
        List<Integer> res = findKDistantIndices.findKDistantIndices(nums,key,k);
        List<Integer> expect = Arrays.asList(1,2,3,4,5,6);
//        Assertions.assertEquals(expect,res);
        Assertions.assertEquals(expect,res);
    }
    @Test
    public void testDigArtifacts(){
        int n = 2;
        int [][] artifacts = {{0,0,0,0},{0,1,1,1}};
        int [][] dig = {{0,0},{0,1}};
        DigArtifacts digArtifacts = new DigArtifacts();
        int res = digArtifacts.digArtifacts(n,artifacts,dig);
        Assertions.assertEquals(1,res);
    }
    @Test
    public void testMaximumTop(){
//        int [] nums = {5,2,2,4,0,6};
//        int k = 4;
//        MaximumTop maximumTop = new MaximumTop();
//        int res = maximumTop.maximumTop(nums,k);
//        Assertions.assertEquals(5,res);
    }
}