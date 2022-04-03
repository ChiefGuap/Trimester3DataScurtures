/*
Creator: Nighthawk Coding Society
Mini Lab Name: Hello Series, featuring Monkey Jumpers
Level: Easy
*/

/*
Imports allow you to use code already written by others.
Java has many standard libraries. The names around the dots in import often give you a hint to the originator of the code.
 */
import java.util.Scanner; //java library for user input
import java.util.HashMap;
import src.Blueprint;
import src.Challenge1;
import src.Challenge2;
import src.stack;
import src.w1c1;
import src.w1c2; 
import src.w1c3; 
import src.queue; 
import src.Exit;
import src.bubbleSort; 



/** Main - entry point class for this project
 1.'C' and Java have a main function/method that is the ENTRY into code execution. Both languages need a file to contain that ENTRY method/function.  Common convention for 'C': main.c.  Convention for Java: Main.java.
 2. Replit requires a "Main.java" file and a main class ("public Class Main").  Inside the class it expects a method named "public static void main(String[] args)"."
 3. Conventions and structures are part of a programming language and the tools you use.  Python people like to pick on these Java conventions, saying they are difficult.  What do you think?
 */
public class Main {   //Everything in Java is inside a class, Squigs, Squigalies, or Curly brackets denote a code block in Java.  This is the beginning of class code block.

    /** main - entry point method for this project
     main is the entry or pri·mor·di·al code block for Java
     */
    static public void main(String[] args)  {  // open squig begins the method

        //creating a Hashmap with the parameters of integer and blueprint.
        // We are setting the id's from 0-2 and assiging them to the specific classes.
        HashMap<Integer, Blueprint> newOptions = new HashMap<Integer, Blueprint>();
        newOptions.put(0, new Exit("Exit"));
        newOptions.put(1, new Challenge1("Option 1"));
        newOptions.put(2, new Challenge2("Option 2"));
        newOptions.put(3, new w1c1("Week 1 Challenge 1")); 
        newOptions.put(4, new w1c2("Week 1 Challenge 2"));
        newOptions.put(5, new w1c3("Week 1 Challenge 3")); 
        newOptions.put(6, new bubbleSort("Bubble Sort example")); 
      

        while(true)
            menu("Menu", newOptions);

    } // close squig ends the method.  What did this method do?

    /**
     * menu - method that is activated by main, this will perform Java code
     * We are using a for loop to call the hasmap data strucutre so that when the user inputs an option, that it will give the user the output they want generated
     */
    public static void menu(String banner, HashMap<Integer, Blueprint> newOptions) {
        System.out.println(banner);

        for (int i = 0; i < newOptions.size(); i++) {
            System.out.println(i + ": " + newOptions.get(i).getwords());
        }

        System.out.print("Option: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            newOptions.get(selection).run();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println("Not correct, please try again.");
        }
    }

}