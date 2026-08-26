class Counter22
{
 public static void main(String args[])
   {
       int n=5;
       int count=(n*(n+1))/2;
      for(int i=1;i<=n;i++)
        {
           int c=count;
          for(int j=i;j<=5;j++)
            {
             
             System.out.print(c);
             System.out.print("\t");
             c-=(j+1);
            }
         System.out.println();
          count-=i;
        }
    }
}