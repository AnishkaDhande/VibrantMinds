import java.util.Scanner;

public class Add_first_and_Last_digit {
    static int add_first_last_digit(int n)
    {
        int sum=0;
        int last=n%10;
        int first=0;
        while(n>9)
        { 
             n=n/10; 
        }
       sum=last+n;
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int p=add_first_last_digit(n);
        System.out.println("Sum of First and last Digit is "+p);
    }
}
