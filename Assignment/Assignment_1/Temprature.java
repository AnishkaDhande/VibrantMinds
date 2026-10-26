import java.util.Scanner;
class Temprature

{
    double Fahrenheit(double a) 
       {
         double f=(a*1.8)+32;
         return f;
       }
 public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter Temprature in Degree celcius : ");
      double c=sc.nextDouble();
      Temprature t1= new Temprature();

      System.out.print("Entered Temprature in Fahrenheit is ");
      System.out.print(t1.Fahrenheit(c));

   }
}