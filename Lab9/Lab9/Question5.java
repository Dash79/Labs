import java.util.ArrayList;
import java.util.Scanner;

/****************************************************************************
 * Check if a number is a perfect number.
 *
 * @author Dawit Getachew
 * @version Lab 9_Version 1
 * @date    24-11-2023
 ****************************************************************************/
 public class Question5
 {
     public static boolean perfect(int x)
     {
         //Declaration and Initialization
         Scanner myScanner = new Scanner(System.in);
         ArrayList <Integer> z;
         int sum = 0;
         
         //User Input
         System.out.print("Num: ");
         x = myScanner.nextInt();
         z = Question4.factor(x);
         
         //Adding up the Factors
         for(int i = 0; i < z.size()-1; i++)
         {
             sum += z.get(i);
         }
         
         //Checking if Perfect
         return sum == x;
     }
 }
 
 
