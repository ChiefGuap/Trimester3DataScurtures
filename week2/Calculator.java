import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.Math; 

public class Calculator{

  String expression;

  ArrayList<String> reverse_polish;
  
  ArrayList<String> tokens;

  private Double resultant;

  
  public Calculator(String expression) {
      
    this.expression = expression;
    
    this.termTokenizer();         

    this.tokensToReversePolishNotation();         // place terms into reverse polish notation

    this.rpnToResult();         // calculate reverse polish notation, as the equation is given 
  }

  private final HashMap<String, Integer> OPERATORS = new HashMap<>();
    {
      // Map<"token", precedence, we have to see who has more power over the other 
      OPERATORS.put("*", 3);
      OPERATORS.put("/", 3);
      OPERATORS.put("%", 3);
      OPERATORS.put("+", 4);
      OPERATORS.put("-", 4);
      OPERATORS.put("^", 2);
    }

    private final HashMap<String, Integer> NUMOPERANDS = new HashMap<>();
    {
      // Map<"token", precedence>
      NUMOPERANDS.put("*", 2);
      NUMOPERANDS.put("/", 2);
      NUMOPERANDS.put("%", 2);
      NUMOPERANDS.put("+", 2);
      NUMOPERANDS.put("-", 2);
      NUMOPERANDS.put("^", 2);

    }
    
    //These are the definitons, the helper ones too make sure that we can do each operator that we want in the code 
    private final HashMap<String, Integer> SEPARATORS = new HashMap<>();
    {
      SEPARATORS.put(" ", 0);
      SEPARATORS.put("(", 0);
      SEPARATORS.put(")", 0);
    }
  
    private boolean isOperator(String token) {
         return OPERATORS.containsKey(token);
    }

    private boolean isSeperator(String token) {
         return SEPARATORS.containsKey(token);
    }

    private Boolean isPrecedent(String token1, String token2) {
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }
    private void tokensToReversePolishNotation () {

      this.reverse_polish = new ArrayList<>();

      LinkedList<String> tokenList = new LinkedList<>();
      RaqStack tokenStack = new RaqStack(tokenList);
      for (String token : tokens) {
        switch (token) {

          case "(":        
            tokenStack.push(token);
            break;
            
          case ")":
            while (tokenStack.peek() != null && !tokenStack.peek().equals("(")){
              reverse_polish.add((String)tokenStack.peek());
              tokenStack.pop();
            }
              tokenStack.pop();
              break;
            
          case "+":
            
          case "-":
                
          case "*":
                
          case "/":
                
          case "%":

          case "^":

            
          while (tokenStack.size() > 0 && tokenStack.peek() != null && isOperator((String) tokenStack.peek())){
            
            if (isPrecedent(token, (String) tokenStack.peek() )) {
              reverse_polish.add((String)tokenStack.peek());
              tokenStack.pop();
              continue;
            }
            
            break;
          }

          tokenStack.push(token);
          break;
                
          default:    
            this.reverse_polish.add(token);
            
            }
        }

      while (tokenStack.size() > 0 && tokenStack.peek() != null) {
        this.reverse_polish.add((String)tokenStack.peek());
        tokenStack.pop();
      }
    }

    private void termTokenizer() {

      this.tokens = new ArrayList<>();

      int start = 0;  // term split starting index
      StringBuilder multiCharTerm = new StringBuilder();  //this is holding the term   
      for (int i = 0; i < this.expression.length(); i++) {
          Character c = this.expression.charAt(i);
          if (isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
            if (multiCharTerm.length() > 0) {                 // Add operator or parenthesis term to list, as we have to count them as part of the token list, as they hold value tp the equation and what order they come in
                  tokens.add(this.expression.substring(start, i));
              }

              if (c != ' ') {
                  tokens.add(c.toString());
              }

              start = i + 1;
              multiCharTerm = new StringBuilder();
          } else {                 

            multiCharTerm.append(c);
          }

      }
      if (multiCharTerm.length() > 0) { //This is going to be the last term in the code 
          tokens.add(this.expression.substring(start));
      }
  }

  private void rpnToResult()
    {
    LinkedList<Double> ccccc= new LinkedList<>();
        RaqStack calculation = new RaqStack(ccccc);
        Double x = 0.0;
        Double y = 0.0;

        for (int i=0; i<reverse_polish.size(); i++)  {
          //double check its location ang gets the key, to see if its in the 1st position
            if (!OPERATORS.containsKey(reverse_polish.get(i))) {
                calculation.push(Double.parseDouble(reverse_polish.get(i)));
            } 
            else {
                if (NUMOPERANDS.get(reverse_polish.get(i)) == 1) {
                    x = (Double)(calculation.peek());
                    calculation.pop();
                } else {
                    // Here are mutiple operatrers that we used to do our calculations using peek and pop
                    x = (Double)(calculation.peek());
                    calculation.pop();
                    y = (Double)(calculation.peek());
                    calculation.pop();
                }
                switch(reverse_polish.get(i)) { 
                    case "+":
                        calculation.push((x + y));
                        break;
                    case "-":
                        calculation.push((x - y));
                        break;
                    case "*":
                        calculation.push((x * y));
                        break;
                    case "/":
                        calculation.push((y / x));
                        break;
                    case "%":
                        calculation.push((y % x));
                        break;
                    case "^":
                      
        
                      calculation.push(Math.pow(x,y));
                      break;
      
                  
                }   
        
            }

          this.resultant = (Double)calculation.peek();
          calculation.pop();
        }

  

 public String toString() {
    return ("Here is everything for the operation! \n" +
            " The Original problem: " + this.expression + "\n" +
            "Tokenized expression: " + this.tokens.toString() + "\n" +
            "Reverse Polish Notation: " + this.reverse_polish.toString() + "\n" +
            "Final result (what you really asked for): " + String.format("%.4f", this.resultant)) + "\n" + "\n";
  }


}