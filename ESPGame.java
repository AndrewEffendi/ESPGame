import java.util.Scanner;       // to perform scanner class
import java.util.Random;        //to perform random numbers

/**
 * @author Andrew Effendi
 */
public class Q18ESPGame 
{
   public static void main(String[] args)  
   {
      // declare the variables
      int colorNum, guessNum, correctCounter; 
      String guess, colorString, result;
      
      //initialize the variables
      guessNum = 99;
      colorNum = 99;
      correctCounter = 0;  
                       
      //Create a scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
                  
      // repeat the program
      for (int i =1; i <= 10; i++)
      {
         // to get random numbers 
         Random rand = new Random();
         colorNum = rand.nextInt(5) + 1; //random number form 1 to 5
         
         //input
         System.out.println("pick a color (Red, Green, Blue, Orange, Yellow)");
         System.out.print("Guess: "); 
         guess = keyboard.nextLine();
         guess = guess.toLowerCase(); // to accept all upper and lower case
         
         //change the guess from sting to interger to compare
         guessNum = assignGuess(guess);
         
         //change the random number to color (String)
         colorString = assignColor(colorNum); 
       
         //output color choosen by computer 
         System.out.println(colorString);
         System.out.println(); //add a blank line
         
         //output result
         result = result(colorNum, guessNum);
         System.out.println(result);
         
         //count the number of wins
         correctCounter += correctCounter(colorNum, guessNum);
         
         }// end for loop
      
      //output the number of wins
      System.out.println("You guess correct " + correctCounter + " times");
      
   }// end main method
   
   private static String assignColor(int colorNum)   
   {
      //declare and initializw the variable
      String colorString = "-";
      
      //Use Switch to assign the values
      switch (colorNum)
      {
         case 1:
            colorString = "Random Color: red";   
            break;
         
         case 2:
            colorString = "Random Color: Green";
            break;
         
         case 3:
            colorString = "Random Color: Blue";
            break;
         
         case 4:
            colorString = "Random Color: Orange";
            break;
      
         case 5:
            colorString = "Random Color: Yellow";
            break;
      
      }//end switch 
      return colorString;
   }//end assignColor
   
   private static int assignGuess(String guess)   
   {
      //declare and initialize the variable
      int num = 99;
      
      //Use Switch to assign the values
      switch (guess)
      {
         case "red":
            num = 1;   
            break;
         
         case "green":
            num = 2;
            break;
         
         case "blue":
            num = 3;
            break;
         
         case "orange":
            num = 4;
            break;
         
         case "yellow":
            num = 5;
            break;
      }//end switch 
      return num;
   }//end assignChoice
   
   private static String result(int colorNum, int guessNum )
   {
      //declare and initialize the variable
      String result = "-";
      if (guessNum == colorNum)
         result = "Correct!\n";
         
      else
         result = "Wrong!\n";
      return result;
   }//end result
 
   private static int correctCounter(int colorNum, int guessNum )
   {
      //declare and initialize the variable
      int correctCounter = 0;
      if (guessNum == colorNum)
         correctCounter++;
      return correctCounter;
   }//end correctCounter
  
}// end class