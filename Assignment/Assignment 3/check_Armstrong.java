import java.util.Scanner;

public class check_Armstrong {
   static int checkArmStrong(int n)
    {
        int temp=n;
        int arm=0;
        int count=0;
          while(n!=0)
            {
              count++;
              n=n/10;
            }
            n=temp;
          while(n!=0)
          {
            int rem=n%10;
            arm=arm+(int)Math.pow(rem, count);
            n=n/10;
          }
          return arm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        int arm=0;
        
        //System.out.println(arm);;
        if(checkArmStrong(n)==temp)
        {
            System.out.println("Number is ArmStrong ");
        }
        else{
            System.out.println("NUmber is not Armstrong");
        }
    }
}
