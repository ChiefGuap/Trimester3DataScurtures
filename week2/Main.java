
import java.util.Scanner; 

public class Main {   
  
    static public void main(String[] args)  {  
    Scanner scan = new Scanner(System.in);



      
      //asaking for user input using system scanner (imported)
        System.out.println("Enter the damn equation brotha or sista!");
        String q = scan.nextLine();  
        Calculator c = new Calculator(q);
        System.out.println(c);
    
    }
    
      
    }

