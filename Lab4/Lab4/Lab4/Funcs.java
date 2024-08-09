/****************************************************************************
 * Creating Static Functions.
 *
 * @author Dawit Getachew
 * @version Lab 4_Version 1
 * @date    06-10-2023
 ****************************************************************************/
 import java.util.Scanner;
 public class Funcs
 {
     public static void main(String[] args)
     {
         // Declaration
         double x1,x2,y1,y2;
         Scanner myScanner = new Scanner(System.in);
         
         //User Input
         System.out.print("x1: ");
         x1 = myScanner.nextInt();
         System.out.print("x2: ");
         x2 = myScanner.nextInt();
         System.out.print("y1: ");
         y1 = myScanner.nextInt();
         System.out.print("y2: ");
         y2 = myScanner.nextInt();
         
         //Output
         
     }
     
     
     /*******************************************************************************************
     * A makeLine function that takes 4 points(x1,x2,y1,y2).
     * Input Parameters: x1,x2,y1,y2
     * Purpose: Displays line in Slope-Intercept
     ********************************************************************************************/

     static void makeLine(double x1, double x2, double y1, double y2)
     {  //Declaration
        double y,x,slope,b;
         
        //Calculations
        y = y2-y1;
        x = x2-x1;
        slope = y/x;
        b = y-(slope*x);
        
        //Output
        System.out.format("y = %.3fx %+ .3f",slope,b);
        
     }
     
     
     
     /***********************************************************************
      * Static Function: getInt
      * Purpose: Takes String as a Parameter and Prompts user for an integer value
      *          returning it to the call point
      * Parameters: A string sentence
      */
     
     static int getInt(String prompt)
     {
         //Declaration
         int num;
         Scanner myScanner = new Scanner(System.in);
         
         //User Input
         System.out.print(prompt);
         num = myScanner.nextInt();
         return num;
         
     }
     
     
     
     
     
     /***********************************************************************
      * Static Function: linearEvaluate
      * Purpose: Determine the value of y
      * Parameters: slope,b,x
      */
     
     static void linearEvaluate(double slope, double b, double x)
     {
         //Declaration
         
         //Calculation
         
         //Output
     }

 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 