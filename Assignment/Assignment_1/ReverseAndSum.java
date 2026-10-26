import java.util.Scanner;
class ReverseAndSum
{
  int reverse(int n)
   {
    int rev=0;
     while(n!=0)
    {
     int rem=n%10;
     rev=rev*10+rem;
     n=n/10;
     }
    return rev;
   }
 
  int sum(int n)
   { 
     int sum=0;
     while(n!=0)
       {
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
       }
     return sum;
   }

   public static void main(String args[])
  {
    ReverseAndSum r1=new ReverseAndSum();
    Scanner sc=new Scanner(System.in);
       do
      {
          System.out.print("Enter number of your choice find sum or reverse number : ");
          int v=sc.nextInt();

          System.out.println("Press 1 for sum of digit ");
          System.out.println("Press 2 for reverse the number ");
          int p=sc.nextInt();
          switch(p)
         {
          case 1:
             System.out.println("Sum of digits is ");
             System.out.print(r1.sum(v));
              break;

          case 2:
             System.out.println("reverse of Number is ");
             System.out.print(r1.reverse(v));
              break;

         default:
             System.out.println("Invalid choice");
         }
      }while(false);
  }
}