package com.company;
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            // int correct is the correct index for the element at index i.
            // for example, if the value at index 0 is 4, then the correct index for
            // the value 4 will be arr[i]-1
            // which is arr[0]-1
            // which is 4-1
            // which is 3.
            // Hence the value 4 should be at index 3 in this array, where
            // index == value-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
                // if the sorted array is something like {1,2,3,4,2} then the element
                // at the last index, which is 2 is not swapped again with it's correct
                // index 1 in this case, because another element 2 is already present
                // at index 1.
                // Hence, the compiler just ignores it, executes the else statement
                // which increments the value of i, then the condition for the while loop
                // is violated and the loop breaks and sorting is done.
            }
            else{
                i++;
            }
    
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

