public class SortWordLengthWise {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String a[]=s1.split(" ");
        for(int i=0;i<a.length-1;i++)
        {
           for(int j=i+1;j<a.length;j++)
           {
            if(a[i].length()>a[j].length())
            {
                String temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
           }
        }
        System.out.println(java.util.Arrays.toString(a));

        
      /*  StringBuilder sb=new StringBuilder();
          for(int i=0;i<a.length;i++)
          {
            sb.append(a[i]);
            sb.append(" ");
          }
          sb.deleteCharAt(sb.length()-1);*/
          //System.out.println(java.util.Arrays.toString(a));
      }
}
