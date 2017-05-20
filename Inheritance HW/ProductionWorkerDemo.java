//Kevin Le

import java.util.*;
import java.text.DecimalFormat;
import java.text.DateFormat;

public class ProductionWorkerDemo
{
    
    public static void main(String[] args)
    {
        String name; String n;
        String number; String num;
        String hireDate; String hd;
        int shift;
        double payRate; double rate;
         
        Scanner s = new Scanner(System.in);
         
        System.out.println("Enter your name: ");
        name = s.nextLine();
         
        System.out.println("Enter your employee number: ");
        number = s.nextLine();
                 
        System.out.println("Enter your hire date: ");
        hireDate = s.nextLine();
         
        System.out.println("Enter your payrate: ");
        payRate = s.nextDouble();
         
        System.out.println("Enter your shift (day=1, night=2): ");
        shift = s.nextInt();
         
         
         
        //Production worker object
        ProductionWorker myWorker = new ProductionWorker(name, number,
                             hireDate, shift, payRate);
         
        System.out.println("---------- Employee Info -----------");
        System.out.println("Name: " + myWorker.getName());
        System.out.println("Employee Number: " + myWorker.getNumber());
        System.out.println("Hire Date: " + myWorker.getHireDate());
        System.out.println("Pay Rate: " +myWorker.getPayRate());
        System.out.println("Shift: " +myWorker.getShift());
    }
     
     
}