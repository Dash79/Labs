/****************************************************************************
 * A Student class.
 *
 * @author Dawit Getachew
 * @version Lab 7_Version 1
 * @date    03-11-2023
 ****************************************************************************/
 
 public class Student
 {
     //Instance Data
     private String first;
     private String fam;
     private Course course1;
     private Course course2;
     private Course course3;
     private Course course4;
     private Course course5;
     //Constructor
     public Student(String inFirst, String inFam, Course inCourse1, Course inCourse2, Course inCourse3, Course inCourse4, Course inCourse5)
     {
         first = inFirst;
         fam = inFam;
         course1 = inCourse1;
         course2 = inCourse2;
         course3 = inCourse3;
         course4 = inCourse4;
         course5 = inCourse5;
     }
     //Methods
     /*****************************************************
      * A method to combine a persons last and first name
      ****************************************************/
      private String construct()
      {
          return fam + "," + first;
      }
      
     /********************************************************
      * A method that returns a string containing the 5 grades
      ********************************************************/
      private String grade()
      {
          return String.format("%d%d%d%d%d",course1.getGrade(),course2.getGrade(),course3.getGrade(),course4.getGrade(),course5.getGrade());
      }
      
     /*************************************
      * A method that returns a users gpa 
      ************************************/
      
      public double gpaVal()
      {
          return (course1.cont() + course2.cont() + course3.cont() + course4.cont() + course5.cont()) / (course1.getCredit() + course2.getCredit() + course3.getCredit() + course4.getCredit() + course5.getCredit());
      }
      
      /***********************
       * A toString method
       ***********************/
       public String toString()
       {
           return "Student: " + construct() + "\nGrade: " + grade() + "\nGPA: " + gpaVal();
       }
      
 }
