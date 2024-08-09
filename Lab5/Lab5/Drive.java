/****************************************************************************
 * Main class to test person class.
 *
 * @author Dawit Getachew
 * @version Lab 5_Version 1
 * @date    13-10-2023
 ****************************************************************************/
 
 public class Drive
 {
     public static void main(String[] args)
     {
         //Declaration
         Person me;
         Person you;
         
         //Initialization
         me = new Person("Jeffrey", "McNally", 50, "M", "Blonde", "Phd" );
         you = new Person("Dawit", "Getachew", 20, "M", "Black", "Bachelors");
         
         //Output
         System.out.println(me.getFirstName());
         System.out.println(me.getLastName());
         System.out.println(me.getAge());
         System.out.println(me.getGender());
         System.out.println(me.getHairColor());
         System.out.println(me.getDegree());
         
         System.out.println(me.setAge(20));
         
         System.out.println(me.toString());
         
         System.out.println(marry());
         
     }
 }
