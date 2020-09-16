 import java.util.Scanner;

/**
 * this program 
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a program for user input 
     Scanner input = new Scanner(System.in); 

    //prompt user for number
    System.out.println("Please enter a number to play FizzBuzz"); 
    //initialize the number from the user
    int number = input.nextInt(); 
    int fizz = number % 3;
    int buzz = number % 5; 
    //determine what the user should say    
    if(fizz == 0 && buzz == 0){ 
      // tell them to say fizzbuzz if a number is divisble by 3 and 5
      System.out.println("you should say FizzBuzz");
    }else if(buzz == 0){ 
      //tell them to say buzz if their number is divisible by 5
      System.out.println("you should say buzz"); 
    }else if(fizz == 0){ 
      //tell them to say fizz if their number divisible by 3
      System.out.println("you should say fizz"); 
    }else if(fizz >= 1 && buzz >= 1){ 
      // tell the user to say original number if none of the above applies
      System.out.println("you should say " + number); 
    }

    
  }
}
