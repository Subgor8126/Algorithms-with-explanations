package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,};
        waveSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // Bubble sort :- I call it wave sort
    // Bubble sort has worst-case time complexity of O(n^2).
    // In best case, it will make n-1 comparisons, where n=size of the array.
    // It is an inplace sorting algorithm, i.e no need to create a new array or copy existing array.
    static void waveSort(int[] arr){
        // i and j are supposed to represent the indices of the array
        // i counts the passes and j does the comparisons and swaps
//        int checks = 0;
        // The 'checks' variable is meant to increment each time 'j' makes a comparison
        // We can try different types of logic to check the number of comparisons and try
        // to reduce that value to write more efficient code
        boolean swapped;
        // The 'swapped' variable helps in sorting the array making less comparisons
        // than usual
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // swapped is set to false whenever the 'i' loop runs
            for (int j = 1; j < arr.length - i; j++) {
                // j<arr.length-i makes sure that only the unsorted part of the array is checked for possible swaps, hence reducing the number of comparisons.
                // j<=arr.length-i-1 will also do the job
//                checks++;
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                    // 'swapped' is set to true whenever the compiler enters the if statement
                    // i.e whenever a swap is done.
                }
            }
            if(!swapped){
                break;
            }
            // Note that the above if statement is outside the 'j' loop but inside the 'i' loop.
            // Which means that it is set to false by default, and if 'swapped' becomes
            // true, then the above statement won't run and the loop will go on.
            // If 'swapped' variable remains false even after the 'j' loop is run, then the above
            // statement will flip it's value, and 'swapped' will become true, the above
            // statement will run and break the loop, preventing any further
            // unnecessary comparisons because according to the logic, the array is
            // already sorted.
        }
//        System.out.println(checks);
    }
}
