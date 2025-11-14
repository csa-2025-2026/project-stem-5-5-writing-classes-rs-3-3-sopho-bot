public class Person
{
    String firstName; 
    String lastName;
    int age; 
    int ssn;

    public Person (String _firstName, String _lastName, int _age, int _ssn)
    {
        firstName = _firstName;
        lastName = _lastName; 
        age = _age;
        ssn = _ssn;
    }
    
    public void print()
    {
        System.out.println("His name is " + firstName + lastName + ", his age is " + age + ", and his ssn is " + ssn);
    }
    
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

    public int getSSN()
    {
        return ssn;
    }
    
    public void updateFirstName(String iFirstName)
    {
        firstName = iFirstName;
    }

    public void updateLastName(String iLastName)
    {
        lastName = iLastName;
    }
    
    public String toString()
    {
        return "First Name and Last Name: " + firstName + lastName + "\n\tAge: " + age + "\n\tSSN: " + ssn;
    }

}
