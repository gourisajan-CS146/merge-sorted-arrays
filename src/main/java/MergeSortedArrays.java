public class SortedArraysMerge{
  public static int[] merge(int[]leftArr,int[]rightArr){
    int length = leftArr.length+rightArr.length;
    int[]mergeArray = new int [length]; 

    int i = 0;
    int j = 0; 
    int k = 0; 

 while(i < leftArr.&&j < rightArr.length){
   if(leftArr[i]<=rightArr[j]){
     mergeArray[k] = leftArr[i];
      k++;
      i++;
  }

else { 
  mergeArray[k] = rightArr[j];
  k++;
  j++;
}

 while(i< leftArr.lemgth){
  mergeArray[k] = leftArr[i];
  i++;
  k++;

} 
while ( j < rightArray.length){
  mergeArray[k] = rightArray[j]; 
  k++;
  j++;
}
return mergeArray; 



