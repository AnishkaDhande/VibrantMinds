public class smallest_Element {
    public static void main(String[] args) {
        int a[]={12,8,42,18,26};
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Smallest Element of Array is "+min);
    }
}
