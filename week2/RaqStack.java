import java.util.LinkedList;


public class RaqStack {

  LinkedList<Object> node1;

    public RaqStack(LinkedList node2) {
        node1 = node2;
    }

    public int size() {
      return(node1.size());
    }

    public void push(Object node) {
      node1.add(0, node);
    }

  //Removing the first object that is entered in the stack
    public void pop() {
      node1.removeFirst();
    }

  //Getting the first node (or object in the stack)
    public Object peek() {
      return(node1.getFirst());
    }
}
