import java.util.Scanner;;
public class Check_Prime_or_not {
    static boolean isPrime(int n)
    {
        boolean b=false;
         if(n==0||n==1)
            b=true;
        else
            for(int i=2;i<=n/2;i++)
              {
                  if(n%i==0)
                    b=true;
                    break;
              }
          return !b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number to be Check ");
        int n=sc.nextInt();
        if(isPrime(n)==true)
        {
            System.out.println("Number is Prime");
        }
        else
            System.out.println("Number is not Prime");
    }
}
