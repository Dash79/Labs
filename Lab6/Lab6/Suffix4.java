/****************************************************************************
 * Suffix Printing using Conditionals.
 *
 * @author Dawit Getachew
 * @version Lab 6_Version 4
 * @date    27-10-2023
 ****************************************************************************/
 import java.lang.Math;
 
 public class Suffix4
 {
     public static void main(String[] args)
     {
         //Declaration and intialization
         int num = (int)(Math.random()*30)+1;
         String suffix = "";
         
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
 
 
 
 
 
