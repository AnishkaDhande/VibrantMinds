import  java.util.Arrays;
public class swap_element_first_to_last_without_3rd_var {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        //      {20,30,40,50,10}

        for(int i=0;i<a.length-1;i++)
        {
           a[i]=a[i]+a[i+1];//10+20=30
           a[i+1]=a[i]-a[i+1];//30-20=10
           a[i]=a[i]-a[i+1];//30-20=10
        }    
        System.out.println(Arrays.toString(a));
         
    }
}
