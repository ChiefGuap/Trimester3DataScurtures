// Selection sort in Java
package src;

import src.Blueprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  

public class SelectionSort extends Blueprint {

    public SelectionSort(String words) {
        super.words = words;
    }

    public String getwords() {
          return words;
    }
  
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  @Override 
  public void run() {
    System.out.println("Give your brotha 5 numbers, and through a selection sort we will put them in condesendcing order (least to greatest"); 
      Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            int number5 = scanner.nextInt(); 
        int data[] = {number1, number2, number3, number4, number5 };
    SelectionSort ss = new SelectionSort("Hotline Bling");
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}