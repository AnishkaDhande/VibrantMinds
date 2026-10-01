class Hollow3
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=n;i>=1;i--)
    {
      if(i==n)
        {
            for(int j=n;j>=1;j--)//i=5
               System.out.print(j);

           for(int j=2;j<=n;j++)
               System.out.print(j);
           
        }
       else
         {
            for(int j=i;j>=1;j--)//i=4
            {
               System.out.print(j);
            }

            for(int j=1;j<=((n-i+1)*2)-3;j++)//i=4
                System.out.print("_"); 

            for(int j=1;j<=i;j++)//i=5
            {
               System.out.print(j);
            }
         }
            
      System.out.println();
    }

   for(int i=2;i<=n;i++)
    {
      if(i==n)
        {
            for(int j=n;j>=1;j--)//i=5
               System.out.print(j);

           for(int j=2;j<=n;j++)
               System.out.print(j);
           
        }
       else
         {
            for(int j=i;j>=1;j--)//i=4
            {
               System.out.print(j);
            }

            for(int j=1;j<=((n-i+1)*2)-3;j++)//i=4
                System.out.print("_"); 

            for(int j=1;j<=i;j++)//i=5
            {
               System.out.print(j);
            }
         }
            
      System.out.println();
    }


  }
}