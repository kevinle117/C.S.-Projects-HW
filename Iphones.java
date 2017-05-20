//Kevin Le
//Final Project
//April 30th, 2017

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Iphone//superclass with accessor,toString, mutator and data fields

{
int year;
Iphone(int y)
{year=y;}
Iphone()
{year=0;
}

int getyear() {
return year;
}
public String toString(){return "Year : "+year;}
void setyear(int x){ year=x;}

} 
interface iphonemodel{//interface with abstract methods{

void printtype();
void printyear();

}
//Inheritence
public class Iphones extends Iphone implements iphonemodel//superclass with accessor,toString, mutator and data fields
{
String name; int year;
static String manufacturinglocation="China";//static field
Iphones(String n,int y)
{
this.name=n;
this.year=y;

}
Iphones(String n)//Method overloading
{
name=n;
year=0;

}
public String toString(){



return "Name : "+name+" Year:"+year+" Manufactured at : "+manufacturinglocation;


}
//static method
static void printmanulocation(){System.out.println("Manufactured at : "+manufacturinglocation);}
public void printtype() {

System.out.println("Iphones");
}
public void printyear() 
{
System.out.println("Year :"+year);

}
int getyear(){return year;}//method overriding
public static void main(String args[])
{
Iphones i=new Iphones("7",2016);
Iphone d=new Iphones("China",2016);
//Aggregation and superclass object reference of subclass type
System.out.println("1.Print Year\n2.Print Manufacturing Location\n3.Print complete data\n4.Print class Type for Iphone ");
String str;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//Exception handling
try {
str=br.readLine();
int x=Integer.parseInt(str);
if(x==1)
{i.printyear();}
if(x==2)
{
printmanulocation();
}
if(x==3)
{
System.out.println(i.toString());
}
if(x==4)
{
System.out.println(d.getClass());
}


} catch (IOException e) {

e.printStackTrace();
}


}
}