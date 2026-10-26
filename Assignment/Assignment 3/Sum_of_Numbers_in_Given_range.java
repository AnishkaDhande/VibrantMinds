import java.util.Scanner;

public class Sum_of_Numbers_in_Given_range {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter start of range : ");
        int n_start=sc.nextInt();
        System.out.println("Enter End of Range : ");
        int n_end=sc.nextInt();
        for(int i=n_start;i<=n_end;i++)
        {
            sum+=i;
        }
                    System.out.println("Sum of Elements in a given Range is  "+sum);
    }
}
