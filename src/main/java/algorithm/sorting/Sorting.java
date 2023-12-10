package algorithm.sorting;

import java.util.*;

import static algorithm.sorting.BubbleSort.bubbleSorting;
import static algorithm.sorting.InsertionSort.insertionSorting;

public class Sorting {
    public static void main(String[] args){
        System.out.println("Different type of Sorting method");

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total number of variable");
        int n = scn.nextInt();
        System.out.println("Enter number");
        for (int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        System.out.println(arr);

        // Insertion Sorting
        insertionSorting(arr);
        System.out.println("Insertion Sort : " + arr);

        // Bubble Sorting
        bubbleSorting(arr);
        System.out.println("Bubble Sort : " + arr);


    }
}
