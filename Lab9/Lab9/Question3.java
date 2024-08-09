import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/****************************************************************************
 * An ArrayList to sort names in order.
 *
 * @author Dawit Getachew
 * @version Lab 9_Version 1
 * @date    24-11-2023
 ****************************************************************************/
 
 public class Question3
 {
     public static void main(String[] args)
     {
         //Declaration and Initialization
         String input;
         Scanner myScanner = new Scanner(System.in);
         ArrayList <String> name = new ArrayList<>();
         boolean done = false;
         
         //User Input
         System.out.println("Input: ");
         
         do
         {
             input = myScanner.nextLine().toLowerCase();
             if(input.equals("done"))
             {
                 done = true;
             }
             else
             {                 
                 name.add(input);
             }
             
         }while(!done);
         
         //Sort using Collections
         Collections.sort(name);
         
         //Print using for loops
         System.out.print("Names: ");
         for(String n:name)
         {
             System.out.print(n+" ");
         }
         System.out.println();
              
         //Print using toStrings
         System.out.println("Names: "+ name.toString());
     }
 }