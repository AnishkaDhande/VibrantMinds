class CounterSpace11
{
   public static void main()
   {
     int n=5;
     int count=(n*(n-1))/2+1;
      for(int i=n;i>=1;i--)
         {
           int c=count;
             for(int j=i;j>1;j--)
               {
                 System.out.print("\t");
               }
             for(int j=n;j>=i;j--)
               {
                 System.out.print(c);
                 System.out.print("\t");
                 c-=j;
               }
          System.out.println();
          count++;
         }
   }
}
