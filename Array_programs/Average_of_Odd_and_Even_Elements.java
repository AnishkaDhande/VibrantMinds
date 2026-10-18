public class Average_of_Odd_and_Even_Elements {
    public static void main(String[] args) {
        int a[]={10,20,5,15,27,60};
        int oddsum=0;
        int evensum=0;
        int oddcount=0;
        double oddavg=0;
        double evenavg=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                oddsum+=a[i];
                oddcount++;
            }
            else
            {
                evensum+=a[i];
            }
        }
        oddavg=oddsum/(double)oddcount;
        evenavg=evensum/(double)(a.length-oddcount);
        System.out.println("Average of Even Elements of Array "+evenavg);
        System.out.println("Average of Odd Elements of Array "+oddavg);

    }
}
