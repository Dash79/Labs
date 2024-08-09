/****************************************************************************
 * Creating Java Objects
 *
 * @author Dawit Getachew
 * @version Lab 5_Version 1
 * @date    13-10-20xx
 ****************************************************************************/

 public class Person
{
// Instance Data
private String firstName;
private String lastName;
private int age;
private String gender;
private String hairColor;
private String degree;

// Constructor
    public Person(String inFirstName, String inLastName, int inAge, String inGender, String inHairColor, String inDegree)
    {
        firstName = inFirstName;
        lastName = inLastName;
        age = inAge;
        gender = inGender;
        hairColor = inHairColor;
        degree = inDegree;
    }

// Methods

    //Accessors
    public String getFirstName()
    {
      return firstName;  
    }
    
    public String getLastName()
    {
      return lastName;  
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getGender()
    {
      return gender;  
    }
    
    public String getHairColor()
    {
      return hairColor;  
    }
    
    public String getDegree()
    {
      return degree;  
    }
    //Mutators
    public int setAge(int newAge)
    {
        age = newAge;
        return age;
    }
    
    //toString
    public String toString()
    {
        String text = firstName + lastName + " is a "+ gender +" that is " + age + " years old with a " + degree +" and a " + hairColor + " hair color.";
        return text;
    }
    
    //Marry
    public String marry(Person newPerson)
    {
        
    }
    
    
    
}