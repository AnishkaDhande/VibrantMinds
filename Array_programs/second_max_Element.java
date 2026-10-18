public class second_max_Element {
    public static void main(String[] args) {
        int a[]={32,13,76,55,71};
        int max=a[0];
        int smax=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
               {
                smax=max;
                 max=a[i];
               }
            else if(a[i]>smax && a[i]!=max)
                smax=a[i];
        }
        System.out.println("Largest Element of Array is "+max);
        System.out.println("Second Max Elemnet of Array is "+smax);
    }
}
