//Kevin Le

public class Employee
{
    
    public String name;
    public String number;
    public String hireDate;
    private boolean validNumber= false;
     
    
    public Employee(String n, String num, String hd)
    {
        name = n;
        number = num;
        hireDate = hd;
    }
     
    public String getName()
    {
        return name;
    }
     
    public String getNumber()
    {       
        while (validNumber = false)
        {
            if (number.length()!=5)
               {
                System.out.println("Invalid employee number, please try again.");
                
            }
            else if
                  (((!Character.isDigit(number.charAt(0))) || ((!Character.isDigit(number.charAt(1)))) ||
                  ((!Character.isDigit(number.charAt(2)))) || (number.charAt(3) !='-') ||
                  ((!Character.isDigit(number.charAt(4)))) || 
                  (!(number.charAt(4)>= 'A' && number.charAt(4)<='M'))))
                   
                  {
                    System.out.println("Invalid employee number, please try again.");
                    System.out.println("Enter your employee number: ");
                  }
                 
             else
                validNumber = true;
            }
        return number;
    }
     
    public String getHireDate()
    {
        return hireDate;
    }
     
       public String toString()
    {
        String str = "Name: " +name+ "\nEmployee Number: ";
         
        if(number =="")
        {
            str+="Invalid Employee Number";
        }
        else
        {
            str+=number;
        }
        str +=("\nHire Date: " +hireDate);
        return str;
    }
}