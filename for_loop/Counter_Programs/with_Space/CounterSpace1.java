class CounterSpace1
 {
  public static void main(String args[])
    {
       int n=5;
       int count=1;
         for(int i=1;i<=n;i++)
           {
              for(int j=i;j<n;j++)
                {
                System.out.print("\t");
                }
              for(int j=i;j>=1;j--)//1-1
                {
                System.out.print(count);
                System.out.print("\t");
                count++;
                }
         System.out.println();
           }
    }
 
}