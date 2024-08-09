import java.util.ArrayList;
import java.util.Scanner;

/****************************************************************************
 * Finding factors of numbers.
 *
 * @author Dawit Getachew
 * @version Lab 9_Version 1
 * @date    24-11-2023
 ****************************************************************************/
 public class Question4
 {
     public static ArrayList factor(int y)
     {
         //Declaration and Initialization
         Scanner myScanner = new Scanner(System.in);
         ArrayList <Integer> nums = new ArrayList<> ();
         
         //User Input
         System.out.print("Num: ");
         y = myScanner.nextInt();
         
         //Loop
         for(int i = 1; i<=y; i++)
         {
             if(y > 0)
             {
                if(y%i == 0)
                 {
                     nums.add(i);
                 }
                
             }
             else
             {
                 System.out.println("Not a Positive Int");
             }
             
         }
         return nums;
         
     }
 }
