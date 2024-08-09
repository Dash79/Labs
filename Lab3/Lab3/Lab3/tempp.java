/****************************************************************************
 * Lab 3 Input and Output.
 *
 * @author Dawit Getachew
 * @version Lab 3_Version 1
 * @date    29-09-2023
 ****************************************************************************/

 
import java.util.Scanner;
import static java.lang.Math.pow; 
public class tempp
{
    public static void main(String [] args)
    {
        // Section 1. Declare and Initialize the variables
        int x,y;
        double z;
        String name;
        Scanner myScanner = new Scanner(System.in); 
        
        
        
        // Section 2. Asking User Input
        
        //  1. Ask User for preferred name.
        System.out.print("Input Preferred Name: ");
        name = myScanner.nextLine();
        
        
        //  2. Ask user for an x value (an integer) and store the value
        System.out.print("Hey " + name + ",input an x-value: ");
        x = myScanner.nextInt();
        
        //  3. Ask user for a y value (an integer) and store the value
        System.out.print("Hey " + name + ",input a y-value: ");
        y = myScanner.nextInt();
        
        //  4. Output a header text line for a table whose columns will be the values of x, y and z 
        System.out.println("x    y    z");
        
        //  5. Determine the value of z using the x and y. Static import the math power method.
        z = (pow(2*x - 2*y + 4, 3)/pow(6*x - 5*y, 2) + 10) + 3;
        
        //  6. Output each number in a single line. All values should show in no less than 16 spaces. Value of Z should be 4 decimal places.
        System.out.println(x+"    "+y+"    "+z);
        
        //  7. Increment x by 2 and repeat calculation of z and output of numbers to start forming a number of tables.
        for(int i = 1; i<6; i++)
            {
                x+=2;
                z = (pow(2*x - 2*y + 4, 3)/pow(6*x - 5*y, 2) + 10) + 3;
                System.out.println(x+"    "+y+"    "+z);
            }
        
        
        //  9. Return x to original value and now increment y by 1. Re-produce your output for each of the five x values
        x-=10;
        for(int i = 1; i<6; i++)
        {
            y++;
            z = (pow(2*x - 2*y + 4, 3)/pow(6*x - 5*y, 2) + 10) + 3;
            System.out.println(x+"    "+y+"    "+z);
        }
        
        
        //  11. Finally add a few blank lines and then print a personalized good by message.
        System.out.println("\n\n\nThanks for using this " + name + ". Have a nice day!");
        
        
    }
}
