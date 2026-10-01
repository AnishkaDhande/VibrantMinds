class ButterFlyAlpha1
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=1;i<=n;i++)
    {
      if(i==n)
        {
         for(int j=1;j<=(n*2)-1;j++)
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }
        }
       else
         {
            for(int j=i;j>=1;j--)//i=1
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }

            for(int j=1;j<=((n-i+1)*2)-3;j++)//i=1//j=5*2-3=7//1-7
                System.out.print("_"); 

            for(int j=i;j>=1;j--)//i=1
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }
         }           
      System.out.println();
    }

   for(int i=n-1;i>=1;i--)
    {
    /*  if(i==n)
        {
         for(int j=1;j<=(n*2)-1;j++)
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }
        }
       else
         {*/
            for(int j=i;j>=1;j--)//i=1
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }

            for(int j=1;j<=((n-i+1)*2)-3;j++)//i=1//j=5*2-3=7//1-7
                System.out.print("_"); 

            for(int j=i;j>=1;j--)//i=1
          {
           if(i%2!=0)
             System.out.print((char)(64+i));
           else
             System.out.print((char)(96+i));
          }
       //  }           
      System.out.println();
    }

  }
}