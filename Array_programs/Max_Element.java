public class Max_Element {
    public static void main(String[] args) {
        int a[]={10,17,25,23,16};
        int max=a[0];
        for(int i=1;i<a.length;i++)//max=a[0];
        {
           if(a[i]>max)
            max=a[i];
        }
        System.out.println("Largest Element of Array is "+max);
    }
}
