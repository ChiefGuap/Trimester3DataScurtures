
import java.util.Scanner; 

public class Main {   
  
    static public void main(String[] args)  {  
    Scanner scan = new Scanner(System.in);



      
      //asaking for user input using system scanner (imported)
        System.out.println("Enter the damn equation brotha or sista!");
        String expression = scan.nextLine();  
        Calculator calc = new Calculator(expression);
        System.out.println(calc);
    
    }
    
      
    }

