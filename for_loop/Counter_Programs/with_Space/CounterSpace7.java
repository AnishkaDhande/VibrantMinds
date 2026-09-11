class CounterSpace7
{
   public static void main(String args[])
     {
        int n=5;
        int count=1;
          for(int i=1;i<=n;i++)
           {
             int c=count;
             for(int j=i;j<n;j++)//1-4
               {
                  System.out.print("\t");
               }
             for(int j=i;j>=1;j--)//1-1
               {
                  System.out.print(c);
                  System.out.print("\t");
                  c--;
               }
            System.out.println();
            count+=i+1;
           }
     }
}