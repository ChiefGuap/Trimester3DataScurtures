package src;

import src.Blueprint;

import java.util.ArrayList;

public class w1c1 extends Blueprint {

    public w1c1(String words) {
        super.words = words;
    }

    
    public String getwords() {
        return words;
    }

    
    public void run() {
        //sentence to be added to queue
        ArrayList<String> sentence = new ArrayList<String>();

        // Using split to chnage the string into a list. The input to .split is a space, it splits the list where there are spaces
        for(String sentence1 : "Seven slimy snakes sallying slowly slithered southward".split(" ")) {
            sentence.add(sentence1);
        }

        //create queue
        queue<String> raqQueue = new queue();

        //enqueue data
        for(String word : sentence) {
            //display word to be queued
            System.out.println("Enqueued Data: " + word);
            //add word to queue
            raqQueue.push(word);

            //count queue values
            System.out.print("Words Counted: " + raqQueue.length() + " ");

            //print queue as string
            System.out.println(raqQueue.display().
                    toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" "," ")
                    .replaceAll(",", " "));
        }

        //dequeue data
        int repeat = raqQueue.length();
        for(int i = 0; i <= repeat; i++) {
            //peek queue (display first value) We are seeing the first value in the               queue 
            System.out.println("Dequeued Data: " + raqQueue.peak());
            //pop queue (remove first value)
            raqQueue.pop();

            //count queue values
            System.out.println("Words Counted: " + raqQueue.length() + " ");

            //print queue as string
            System.out.print("Data: ");
            System.out.print(raqQueue.display().
                    toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" "," ")
                    .replaceAll(",", " "));

            if(raqQueue.peak() == null) {
                System.out.println("null");
            }
        }
    }
}
