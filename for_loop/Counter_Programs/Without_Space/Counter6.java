class Counter6
{      
      public static void main(String args[])
    {
       int n=5;
       int count=n;
        for(int i=n;i>=1;i--)
         {
          int c=count;
           for(int j=5;j>=i;j--)
            {
               System.out.print(c);
               System.out.print("\t");
               c+=j;
            }
         System.out.println();
              count--;
         }
    }
}