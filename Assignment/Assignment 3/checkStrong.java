import java.util.Scanner;

public class checkStrong {
    static int fact(int n){
        int fact=1;
       for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    static boolean isStrong(int n)
    {
        int temp=n;
        int sum=0;
        boolean p=false;
        while(n!=0)
        {
            int rem=n%10;
            sum+=fact(rem);
            n=n/10; 
        }
       if(temp==sum)
            p=true;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
         if(isStrong(n)==true)
        {
            System.out.println("Number is Strong");
        }
        else
          System.out.println("Number is NOT Strong");
       // System.out.println(isStrong( n));

    }
}
