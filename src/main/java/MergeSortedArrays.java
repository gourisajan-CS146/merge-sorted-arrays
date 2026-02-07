public class SortedArraysMerge {

    public static int[] merge(int[] leftArr, int[] rightArr) {

        int length = leftArr.length + rightArr.length;
        int[] mergeArray = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                mergeArray[k] = leftArr[i];
                i++;
            } else {
                mergeArray[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left array
        while (i < leftArr.length) {
            mergeArray[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right array
        while (j < rightArr.length) {
            mergeArray[k] = rightArr[j];
            j++;
            k++;
        }

        return mergeArray;
    }
}

