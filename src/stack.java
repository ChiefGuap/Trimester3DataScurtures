package src;

//imports
import java.util.ArrayList;
import java.util.EmptyStackException;

public class stack<x> {
    private ArrayList<x> list = new ArrayList<x>();

    //constructor, making usre that we will be able to call the code 
    public stack(){

    }
  
    //add to stack (add)
    public void add(x info){
        list.add(info);
    }

    //remove from stack (pop)
    public void delete(){
        //if list is not empty
        if(!list.isEmpty()){
            //removing the last item from list
            list.remove(list.size()-1);
        }
        else{
            System.out.println("null");
        }
    }

    //view top of stack (peak)
    public x peak(){
        if(!list.isEmpty()){
          //If this stack isn't empty, then you we are remvoing the last value from             the stack
            return list.get(list.size() -1 );
        }
        else{
            return null;
        }
    }

    //view length of stack
    public int length(){
        return list.size();
    }

    //clear stack
    public void clear(){
        list.clear();
    }

    public void display(){
        System.out.println(list);
    }

}