package javaapplication1;
import java.util.*;
public class calculator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
     
         char op;
  
    for(int i=1; i<2; i++){
      System.out.println("Choose 1 operation: (+ , - , * , / )");
      op  = input.next().charAt(0);
      if((op == '+') || (op == '-') || (op == '*') || (op == '/')){
        switch(op){
          case '+':  Addition();
            break;
          case '-':  Subtraction();
            break;
          case '*': multiplication();
            break;
          case '/': division();
            break;
        }
      }
      else
        i--;
    }
    System.out.println("Program finished");

}

    static void Addition(){  
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 2 numbber :");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
          System.out.println (num1 + " + " + num2 + " = " + (num1+num2));
           
            }
    
    static void Subtraction(){  
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 2 numbber :");
           double num1 = input.nextDouble();
           double num2 = input.nextDouble();
          System.out.println (num1 + " - " + num2 + " = " + (num1-num2));
           
            }
    
     static void division(){  
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 2 numbber :");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
          System.out.println (num1 + " / " + num2 + " = " + (num1/num2));
           
            }
     
    static void multiplication(){  
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 2 numbber :");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
          System.out.println (num1 + " * " + num2 + " = " + (num1*num2));
           
            }
}

