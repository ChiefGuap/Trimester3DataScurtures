package src;

import src.Blueprint;

import java.util.Arrays;
import java.util.List;

public class w1c2 extends Blueprint {

    public w1c2(String words) {
        super.words = words;
    }

    public String getwords() {
          return words;
    }
  
    public void run() {
        //queue list numbers
        List<Integer> q1_list = Arrays.asList(1, 4, 5, 8);
        List<Integer> q2_list = Arrays.asList(2, 3, 6, 7);

        //initialize queues
        queue<Integer> queue1 = new queue();
        queue<Integer> queue2 = new queue();

        //initialize output queue
        queue<Integer> output = new queue();

        //insert list into q1 We are using the push method to add all the numbers from the list array that we made into queue
        for(int num : q1_list) {
            queue1.push(num);
        }

        for(int num : q2_list) {
            queue2.push(num);
        }

        //Displaying both of the lists and distinting them
        System.out.println("List 1: " + queue1.display());
        System.out.println("List 2: " + queue2.display());

        //loop until both lists are empty
        while((queue1.display() != null) || (queue2.display() != null)) {
            try {
                //checks whether q1's output or q2's output is smaller
                if((queue1.peak() < queue2.peak()))  {
                    output.push(queue1.peak());
                    queue1.pop();
                }
                else if((queue2.peak()) < queue1.peak() || ((queue1.peak()) == null) || (queue2.peak() == null)) {
                    output.push(queue2.peak());
                    queue2.pop();
                }
                //when a list is null, move to this section
                //appends any remaining values
            } catch (Exception e) {
                if(queue1.peak() == null) {
                    output.push(queue2.peak());
                    queue2.pop();
                    break;
                }
                else if(queue2.peak() == null) {
                    output.push(queue1.peak());
                    queue1.pop();
                    break;
                }
            }
        }

        System.out.println("Output: " + output.display());

    }
}