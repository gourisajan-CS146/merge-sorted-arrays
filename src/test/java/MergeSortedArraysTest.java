import org.junit.*;
public class TestMergeArrays{
  @Test
  public void testMerge(){
    int[] leftArr = { 2,4,6 };
    int[] rightArr = { 1,3,5};

   int[]expected = {1,2,3,4,5,6}; 
  int [] result = sortedArraysMerge.merge(leftArr,rightArr)
    assertArrayEquals(expected,result);
  }

public void testMergewithUnequalArray(){
  int []leftArr = {1};
  int [] rightArr = {2,3,5};
  int[] expected = {1,2,3,5};
   int [] result = sortedArraysmerge.merge(leftArr,rightArr)
     assertArraysEquals(expected,result); 

}
    
