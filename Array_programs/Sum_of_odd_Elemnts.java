public class Sum_of_odd_Elemnts {
    public static void main(String[] args) {
        int a[]={10,20,4,5,3};
        int oddsum=0;
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2!=0)
        {
            oddsum+=a[i];
        }
     }
     System.out.println("The Sum of Odd Elements of Array "+oddsum);

    }
}
