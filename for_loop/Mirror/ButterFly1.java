class ButterFly1
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=n;i>=1;i--)
    {
      if(i==1)
        {
            for(int j=1;j<=(n*2)-1;j++)//i=1
                System.out.print(i);     
        }
       else
         {
            for(int j=i;j<=n;j++)//i=5
                System.out.print(i);

            for(int j=1;j<=(i*2)-3;j++)//i=5
                System.out.print("_"); 

            for(int j=i;j<=n;j++)//i=5
                System.out.print(i);

         }
            
      System.out.println();
    }

   for(int i=2;i<=n;i++)
    {
      if(i==1)
        {
            for(int j=1;j<=(n*2)-1;j++)//i=1
                System.out.print(i);     
        }
       else
         {
            for(int j=i;j<=n;j++)//i=5
                System.out.print(i);

            for(int j=1;j<=(i*2)-3;j++)//i=5
                System.out.print("_"); 

            for(int j=i;j<=n;j++)//i=5
                System.out.print(i);

         }
            
      System.out.println();
    }

  }
}