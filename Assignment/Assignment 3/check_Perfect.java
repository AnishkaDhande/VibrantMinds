import java.util.Scanner;

public class check_Perfect {
   static boolean checkPerfect(int n)
    {
      int temp=n;
      int sum=0;
      for(int i=1;i<n;i++)
      {
        if(n%i==0)
        {
            sum=sum+i;
        }
      }
      return sum==temp;
    }
    public static void main(String[] args) {
        //6=,1,2,3 factors
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Check");
        int n=sc.nextInt();
        if(checkPerfect(n)==true)
        {
            System.out.println("The Number is Perfect");
        }
        else{
            System.out.println("The Number is Not Perfect");
        }
    }
}
