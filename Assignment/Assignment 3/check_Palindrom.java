import java.util.Scanner;

public class check_Palindrom {
    static boolean checkPalindrom(int n)
    {
        
        boolean p=false;
        int temp=n;
        int rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            p=true;
      return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
      if(checkPalindrom(n)==true)
          System.out.println("Number is Palindrom");
      else
        System.out.println("Number is NOT Palindrom");
    }
}
