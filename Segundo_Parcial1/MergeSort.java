//
public class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(String arr[], int initialIndex, int middleIndex, int lastIndex)
    {
        //arr, initialIndex,initialIndex, lastIndex 
        //Find sizes of two subarrays to be merged
        int firstSubarraySize = middleIndex - initialIndex + 1;
        int secondSubarraySize = lastIndex - middleIndex;

        // Create temp arrays
        String L[] = new String[firstSubarraySize];
        String R[] = new String[secondSubarraySize];

        // Copy data to temp arrays
        for (int i = 0; i < firstSubarraySize; ++i){
            L[i] = arr[initialIndex + i];}
        for (int j = 0; j < secondSubarraySize; ++j){
            R[j] = arr[middleIndex + 1 + j];}

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = initialIndex;
        while (i < firstSubarraySize && j < secondSubarraySize) {
            if ((int) L[i].charAt(0) >= (int) R[j].charAt(0)) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < firstSubarraySize) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < secondSubarraySize) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(String arr[], int initialIndex, int lastIndex)
    {
        if (initialIndex < lastIndex) {

            // Find the middle point
            int middleIndex = initialIndex + (lastIndex - initialIndex) / 2;

            // Sort first and second halves
            sort(arr, initialIndex, middleIndex);
            sort(arr, middleIndex + 1, lastIndex);

            // Merge the sorted halves
            merge(arr, initialIndex, middleIndex, lastIndex);
        }
    }

    // A utility function to print array of size n
    static void printArray(String arr[])
    {
        for (int i = 0; i < arr.length ; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
