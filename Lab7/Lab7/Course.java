/****************************************************************************
 * A Course object.
 *
 * @author Dawit Getachew
 * @version Lab 17_Version 1
 * @date    03-11-2023
 ****************************************************************************/
 
 public class Course
 {
     // Declaration and intialization
     private int grade;
     private double credit;
     
     //Constructor
     public Course(int inGrade, double inCredit)
     {
         grade = inGrade;
         credit = inCredit;
     }
     
     //Methods
     //Accessor
     public int getGrade()
     {
         return grade;
     }
     public double getCredit()
     {
         return credit;
     }
     
     /************************************************************
      * A method that returns a letter grade given a number grade
      ************************************************************/
     public String letter()
     {
         String let = "";
         //If else Statements
         if(grade>=90)
         {
             let = "A+";
         }
         else if(grade >=85)
         {
             let = "A";
         }
         else if(grade>=80)
         {
             let = "A-";
         }
         else if(grade>=75)
         {
             let = "B+";
         }
         else if(grade>=70)
         {
             let = "B";
         }
         else if(grade>=65)
         {
             let = "B-";
         }
         else if(grade>=58)
         {
             let = "C+";
         }
         else if(grade>=50)
         {
             let = "C";
         }
         else if(grade>=45)
         {
             let = "D";
         }
         else
         {
             let = "F";
         }
         
         return let;
     }
     
     /************************************
      * A method that returns a GPA score
      ************************************/
     
     private double gpa()
     {
         double gpa = 0;
         switch(letter())
         {
             case"A+":
                 gpa = 4.3;
                 break;
             case"A":
                 gpa = 4;
                 break;
             case"A-":
                 gpa = 3.7;
                 break;
             case"B+":
                 gpa = 3.3;
                 break;
             case"B":
                 gpa = 3.0;
                 break;
             case"B-":
                 gpa = 2.7;
                 break;
             case"C+":
                 gpa = 2.3;
                 break;
             case"C":
                 gpa = 2.0;
                 break;
             case"D":
                 gpa = 1.0;
                 break;
             case"F":
                 gpa = 0;
                 break;
             default:
                 break;
         }
         return gpa;
     }
     
     /********************************************
      * A method that returns the gpa contribution
      ********************************************/
     public double cont()
     {
         double cont = getCredit()*gpa();
         return cont;
     }
    
 }
