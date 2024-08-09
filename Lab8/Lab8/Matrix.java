/****************************************************************************
 * M × n matrix of double values Hello World Program.
 *
 * @author Dawit Getachew
 * @version Lab 8_Version 1
 * @date    17-11-2023
 ****************************************************************************/
 import java.util.Random;
 
 
 public class Matrix
 {
     //Instance Data
     private int row;
     private int column;
     private double[][] A;
     
     //Constructor
     public Matrix(int row, int column)
     {
         this.row = row;
         this.column = column;
         
         
     }
     
     //Methods
     
     //Method to print random no. between -10 and 10
     public void rand()
     {
         A = new double[row][column];
         Random random = new Random();
         
         //Loop to print the no.
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             {
                 A[i][j] = random.nextInt(21)-10;
             }
         }
     }
     
     //Method to print Matrix in Standard form
     public void standard()
     {
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             {
                 System.out.print(A[i][j]+"\t");
             }
             System.out.println();
         }
     }
     
     
     //Accessors
     public int getRow()
     {
         return row;
     }
     public int getColumn()
     {
         return column;
     }
     public double[][] getData()
     {
         return A;
     }
     
     //Mutator
     public void setElement(int i, int j, double element)
     {
         A[i][j] = element;
     }
     
     //Transpose
     public void transpose()
     {
         Matrix B = new Matrix(column, row);
         
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             {
                 B.setElement(j, i, A[i][j]);
             }
         }
         /*
         int swap;
         swap = row;
         row = column;
         column = swap;
         A = B;*/
         
        
     }
     
     //Scalar Multiply
     public void scalarMultiply(double c)
     {
         Matrix C = new Matrix(row, column);
         
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             {
                C.setElement(i, j, c*A[i][j]);
             }
         }
         
     }
     
     //Adding two matrices
     public Matrix add(double[][] B)
     {
         Matrix D = new Matrix(row, column);
         
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             {
                D.setElement(i, j, A[i][j] + B[i][j]); 
             }
         }
         return D;
     }
     
     //Creating Linear Combination
     public void sum(double[][] B, double n1, double n2)
     {
         Matrix E = new Matrix(row, column);
         
         for(int i = 0; i<row; i++)
         {
             for(int j = 0; j<column; j++)
             {
                 //E.setElement(i, j, 
                 System.out.println(n1+""+A[i][j]+" + "+n2+""+B[i][j]);
             }
         }
     }
 }
