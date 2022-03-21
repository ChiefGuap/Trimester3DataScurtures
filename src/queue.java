package src; 


import java.util.ArrayList;

public class queue<x> {

    private ArrayList<x> list = new ArrayList<x>();

    public queue() {}

    public void push(x data){
        list.add(data);
    }

    //We are using the push and pop command so we can remove and add elements from        the queue
    //remove from queue (pop)
    public void pop(){
        //if list is not empty
        if(!list.isEmpty()){
            //remove the first item from the list
            list.remove(0);
        }
        else{
            System.out.println("null");
        }
    }

    //view top of queue (peak)
    public x peak(){
        if(!list.isEmpty()){
          //If the list is not empty, we are getting the value for the 1st term                 (the 0th term)
            return list.get(0);
        }
        else{
            return null;
        }
    }

    //view entire queue
    public ArrayList<x> display(){
        return list;
    }

    //view length of queue
    public int length(){
        return list.size();
    }

    //clear queue
    public void clear(){
        list.clear();
    }
}
