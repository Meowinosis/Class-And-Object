package stopwatch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void sort(int[] arr,Stopwatch timer)
    {
        int n = arr.length;
        timer.start();
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        timer.stop();
    }
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100000;
        int[] arr = new int[100000];
        for(int i=0;i<arr.length;i++){
            arr[i]= r.nextInt(high-low) + low;
        }
        Stopwatch st = new Stopwatch();
        sort(arr, st);
        System.out.println("The timer of selection sort is " +st.getElapsedTime() +"ms");
    }
}
