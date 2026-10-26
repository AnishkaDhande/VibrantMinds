import java.util.Scanner;

/**
 * Calculator
 */
class Overloading1
{
    int sum(int a,int b)
    {
       return a+b;
    }
    float sum(float a,float b)
    {
       return a+b;
    }
    float sum(int a,float b)
    {
       return a+b;
    }
    float sum(float a,int b)
    {
       return a+b;
    }
     int sub(int a,int b)
    {
       return a-b;
    }
    float sub(float a,float b)
    {
       return a-b;
    }
    float sub(int a,float b)
    {
       return a-b;
    }
    float sub(float a,int b)
    {
       return a-b;
    }
     int mul(int a,int b)
    {
       return a*b;
    }
    float mul(float a,float b)
    {
       return a*b;
    }
    float mul(int a,float b)
    {
       return a*b;
    }
    float mul(float a,int b)
    {
       return a*b;
    }

     int div(int a,int b)
    {
         if(b==0)
        {
        System.out.println("Please Enter 2nd digit non negative");
           return -1;
        }
        else
         return a/b;
    }
    float div(float a,float b)
    {
       if(b==0)
        {
        System.out.println("Please Enter 2nd digit non negative");
           return -1;
        }
        else
         return a/b;
    }
    float div(int a,float b)
    {
       if(b==0)
        {
        System.out.println("Please Enter 2nd digit non negative");
           return -1;
        }
        else
         return a/b;
    }
    float div(float a,int b)
    {
       if(b==0)
        {
        System.out.println("Please Enter 2nd digit non negative");
           return -1;
        }
        else
         return a/b;
    }
}
public class Calculator {
public static void main(String[] args) {
    Overloading1 o1=new Overloading1();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Sum of two Numbers is "+o1.sum(2,2.4f));
    System.out.println("Sum of two Numbers is "+o1.sum(1,2));
    System.out.println("Sum of two Numbers is "+o1.sum(2.1f,2.4f));
    System.out.println("Sum of two Numbers is "+o1.sum(8.1f,2));

    System.out.println("Difference of two Numbers is "+o1.sub(4,2.4f));
    System.out.println("Difference of two Numbers is "+o1.sub(1,2));
    System.out.println("Difference of two Numbers is "+o1.sub(2.1f,2.4f));
    System.out.println("Difference of two Numbers is "+o1.sub(8.1f,2));

    System.out.println("Product of two Numbers is "+o1.div(4,2.4f));
    System.out.println("Product of two Numbers is "+o1.div(4,2));
    System.out.println("Product of two Numbers is "+o1.div(2.1f,2.4f));
    System.out.println("Product of two Numbers is "+o1.div(8.1f,4));
}
    
}