import java.util.Arrays;

public class Reverse_Array_using_2_Pointer {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
              //{50,40,30,20,10}
              //x->
              //             <-y
        int x=0;
        int y=a.length-1;
        for(int i=x,j=y;i<j;i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
     System.out.println(Arrays.toString(a));
    }
}
