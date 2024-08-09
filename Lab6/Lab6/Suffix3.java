/****************************************************************************
 * Suffix Printing using Conditionals.
 *
 * @author Dawit Getachew
 * @version Lab 6_Version 3
 * @date    27-10-2023
 ****************************************************************************/
 import java.util.Scanner;
 
 public class Suffix3
 {
     public static void main(String[] args)
     {
         //Declaration and intialization
         int num;
         Scanner userInput = new Scanner(System.in);
         String suffix = "";
         //User Input
         System.out.println("Input num between 1-31: ");
         num = userInput.nextInt();
         
         //Conditional Computation
         
         if(num%10 == 1 && num!=11)
         {
             suffix = "st";
         }
         else if(num%10 == 2 && num!=12)
         {
             suffix = "nd";
         }
         else if(num%10 == 3 && num!=13)
         {
             suffix = "rd";
         }
         else
         {
             suffix = "th";
         }
         
         //Output
         
         System.out.println(num+suffix);
         
         
     }
 }
 
 
 
 
 
