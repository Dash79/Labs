/****************************************************************************
 * A method(main) that tests the Student class.
 *
 * @author Dawit Getachew
 * @version Lab 7_Version 1
 * @date    03-11-2023
 ****************************************************************************/

 public class StudentEnrollment
 {
     public static void main(String[] args)
     {
         //Declaration and Initialization
         Course course1 = new Course(100,4);
         Course course2 = new Course(100,4);
         Course course3 = new Course(100,4);
         Course course4 = new Course(100,4);
         Course course5 = new Course(100,4);
         
         Course coursea = new Course(100,4);
         Course courseb = new Course(100,4);
         Course coursec = new Course(100,4);
         Course coursed = new Course(100,4);
         Course coursee = new Course(100,4);
         
         Student student1 = new Student("Dawit","Getachew",course1,course2,course3,course4,course5);
         Student student2 = new Student("Dawit","Ashenafi",coursea,courseb,coursec,coursed,coursee);
         
         //Conditionals
         if(student1.gpaVal() > student2.gpaVal())
         {
             System.out.println(student1);
         }
         else if(student1.gpaVal() < student2.gpaVal())
         {
             System.out.println(student2);
         }
         else
         {
             System.out.println("They are equal");
         }
        
     }
 }