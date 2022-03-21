package src;

import src.Blueprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class w1c3 extends Blueprint {

    public w1c3(String words) {
        super.words = words;
    }

    public String getwords() {
          return words;
    }
    

    @Override
    public void run() {
        //initialize queues
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        queue<Integer> start = new queue();

      // We are adding the array loist that we created through the push command 
        for(int num : list) {
            start.push(num);
        }

        //create stack
        stack<Integer> output = new stack();

        //move queue elements into stack
      // a loop that adds all the numbers from the queue to the stack
      //First in, first out 
        int m = start.length();
        for(int i = 0; i < m; i++) {
            output.add(start.peak());
            start.pop();
        }

        //put stack into a list
        ArrayList<Integer> output_list = new ArrayList<Integer>();

      
        // This is istead the length of the stack and not the queue 
        // This is swapping the order
        //First in, last out 
        int r = output.length();
        for(int i = 0; i < r; i++) {
            output_list.add(output.peak());
            output.delete();
        }

        //display output
        System.out.print("Before: ");

        System.out.println(list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" "," ")
                .replaceAll(",", " "));

        System.out.print("After: ");
        System.out.println(output_list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" "," ")
                .replaceAll(",", " "));
    }
}