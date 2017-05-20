//Kevin Le

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;

public class ProductionWorker extends Employee //this is correct - need this
{
   public static int dayShift =1;
   public static int nightShift=2;
   private int shift;
    
   private double payRate;
   private boolean rightShift =false;
    
    
   public String getShift() //EDIT#2: FIXED (this will be good enough for me!)
   {
       String shiftTime;
        
       if (shift==1)
            shiftTime = "Day";
       else if (shift==2) 
            shiftTime = "Night";
       else if (shift==3)
            shiftTime = "Alternating";
       else
            shiftTime = "On Call";
                    
       return shiftTime;
    }
 
    
   public void setShift(int s)
    {
        shift = s;
    }
     
   public double getPayRate()
   {
       return payRate;
    }
     
   public void setPayRate(double rate)
   {
        payRate = rate;    
   }
    
        
        
   /**
    * Constructor initializes a name, number and hire date
    */
    
   public ProductionWorker(//String name, String number, String hireDate, 
    String n, String num, String hd, int sh, double rate)
   {
       
       super(n, num, hd);
       shift = sh;
       payRate = rate;
    }
     
    public ProductionWorker(String n, String num, String hd)
    {
        super(n, num, hd);
        shift = dayShift;
        payRate = 0.0;
    }
   
    public String toString()
    {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
         
        String str = super.toString();
         
        str+= "\nShift: ";
        if(shift==dayShift)
            str+="Day";
        else if (shift ==nightShift)
            str+="Nights";
        else
            str+= "Invalid Shift Number";
             
        str+= ("\n Hourly Pay Rate: $" +
            dollar.format(payRate));
             
        return str;
    }
    
}