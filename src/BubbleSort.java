package src;

import src.Blueprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.util.*; 

public class BubbleSort extends Blueprint {

      public BubbleSort(String words) {
        super.words = words;
    }

    public String getwords() {
          return words;
    }

   // Java program for implementation of Bubble Sort
    void BubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    @Override
    public void run() {
    {
        BubbleSort ob = new BubbleSort("Un-Sorted Array");
      System.out.println("Give your brotha 5 numbers, and through a bubble sort we will put them in condesendcing order (least to greatest"); 
      Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            int number5 = scanner.nextInt(); 
        int arr[] = {number1, number2, number3, number4, number5 };
        ob.BubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
}
 



