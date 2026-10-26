import java.util.Scanner;

public class print_no_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number until you want to print");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
