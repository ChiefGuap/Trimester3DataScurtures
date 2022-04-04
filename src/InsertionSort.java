// Insertion sort in Java
package src;

import src.Blueprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.util.*; 

public class InsertionSort extends Blueprint {

      public InsertionSort(String words) {
        super.words = words;
    }

    public String getwords() {
          return words;
    }

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Driver code
  @Override
  public void run() {

     long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

      
        BubbleSort ob = new BubbleSort("Un-Sorted Array");
      System.out.println("Give your brotha 5 numbers, and through a Insertion sort we will put them in condesendcing order (least to greatest"); 
      Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            int number5 = scanner.nextInt(); 
        int data[] = {number1, number2, number3, number4, number5 };
    InsertionSort is = new InsertionSort("Disturbia");
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
     System.out.println("The amount of time in milliseconds it took to compile this code (uding Insertion Sort)" + elapsedTime + " Milliseconds");
  }
}
