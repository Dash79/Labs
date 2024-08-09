public class Lab10 
{
     private static String[] dayWords = 
     {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
     };

     private static String[] day = {
            "a Partridge in a Pear Tree.",
            "Two Turtle Doves, and",
            "Three French Hens,",
            "Four Calling Birds,",
            "Five Gold Rings,",
            "Six Geese-a-Laying,",
            "Seven Swans-a-Swimming,",
            "Eight Maids-a-Milking,",
            "Nine Ladies Dancing,",
            "Ten Lords-a-Leaping,",
            "Eleven Pipers Piping,",
            "Twelve Drummers Drumming,"
        };

    
    public static void main(String[] args) 
    {
        // program your flow chart here
        //Declaration and Initialization
        int n = 12;
        
        //Loop and If else
        for(int i = 1; i <= 12; i++)
        {
            System.out.format("On the %d%s day of christmas\n", i, suffix(i));
            System.out.format("my true love gave to me\n");
            
            //Switch Case
            switch(i)
            {
                case 12:
                    System.out.print(day[11]);
                case 11:
                    System.out.print(day[10]);
                case 10:
                    System.out.print(day[9]);    
                case 9:
                    System.out.print(day[8]);    
                case 8:
                    System.out.print(day[7]);
                case 7:
                    System.out.print(day[6]);
                case 6:
                    System.out.print(day[5]);
                case 5:
                    System.out.print(day[4]);
                case 4:
                    System.out.print(day[3]);
                case 3:
                    System.out.print(day[2]);
                case 2:
                    System.out.print(day[1]);
                case 1:
                    System.out.println(day[0]);
                default:
                    break;
            }
        }
        
        
    }
    
    // copy in your suffix method here as a static method with STring return
    public static String suffix(int num)
    {
        //Declaration
        String suffix = "";
        
        //Conditional
        if(num%10 == 1 && num!=11)
         {
             suffix = "st";
         }
         else
         {
             if(num%10 == 2 && num!=12)
             {
                 suffix = "nd";
             }
             else
             {
                 if(num%10 == 3 && num!=13)
                 {
                     suffix = "rd";
                 }
                 else
                 {
                     suffix = "th";
                 }  
             }
             
         }
         
         //Output
         return suffix;
    }
}   
