import java.util.Random;
import java.util.Scanner;
/*****************************************
 * @author Dawit Ashenafi Getachew
 * @version Lab10-Program1
 * @date 01/12/23
 * 
 ******************************************/
public class Lab10_1
{
    //Main Method
    public static void main(String[] args)
    {
        //Declaration and Initialization
        int n;
        double[][] A;
        double[][] B;
        Scanner myScanner = new Scanner(System.in);
        
        //User input and Validation
        System.out.print("Value of n: ");
        n = myScanner.nextInt();
        if(n <= 0)
        {
            System.out.println("Number has to be Positive");
        }
        else
        {
            A = program1(n,n);
            B = program1(n,1);
            program2(A,B);   
        }
    }
    
    //Program 1 Method
    public static double[][] program1(int n, int m)
    {
        //Declaration
        double[][] A = new double[n][m];
        Random rand = new Random();
        
        //Loop
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                A[i][j] = rand.nextInt(10)+1;
            }
        }
        
        //Output
        return A;
    }
    
    //Program 2 Method
    public static void program2(double[][] A, double[][] B)
    {
        //Declaration
        int n = A.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.format("%7.2f", A[i][j]);
            }
        }
        System.out.format("%7.2f\n",B[n][1]);

    }   
}
