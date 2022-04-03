import java.util.LinkedList;


public class RaquibStack {

  LinkedList<Object> o1;

    public RaquibStack(LinkedList o2) {
        o1 = o2;
    }

    public int size() {
      return(o1.size());
    }

    public void push(Object o) {
      o1.add(0, o);
    }

    public void pop() {
      o1.removeFirst();
    }

    public Object peek() {
      return(o1.getFirst());
    }
}