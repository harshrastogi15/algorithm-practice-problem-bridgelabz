package algorithm.sorting;

import java.util.ArrayList;

public class BubbleSort {
    static void bubbleSorting(ArrayList<Integer> arr)
    {
        int n = arr.size();
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j+1)) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
}
