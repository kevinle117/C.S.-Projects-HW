//Kevin Le
//March 10th, 2017

import java.util.Scanner;

import java.io.FileReader;

import java.io.IOException;

import java.io.PrintWriter;
 
public class UpperCaseFile
{
   public static void main (String [] args) throws IOException
   {
      Scanner in = new Scanner(System.in);
               
      System.out.print("In file name: ");
      String inFileName = in.nextLine();
      System.out.print("Out file name: ");
      String outFileName = in.nextLine();
               
      FileReader reader = new FileReader(inFileName);
      PrintWriter writer = new PrintWriter(outFileName);
      Scanner fileReader = new Scanner(reader);
               
      while(fileReader.hasNext())
      {
         String line = fileReader.nextLine();
         line = line.toUpperCase();
         writer.println(line);
      }
               
      fileReader.close();
      writer.close();
               
      System.out.println("Complete.");
   }
}