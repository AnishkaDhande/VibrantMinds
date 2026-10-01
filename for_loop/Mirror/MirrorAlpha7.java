class MirrorAlpha7
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=1;i<=n;i++)
    {
      if(i==n)
        {
          for(int j=n;j>=1;j--)
           {
            if(j%2!=0)
               System.out.print((char)(64+j));
           else
               System.out.print((char)(96+j));
           }

          for(int j=2;j<=n;j++)
           {
            if(j%2!=0)
               System.out.print((char)(64+j));
           else
               System.out.print((char)(96+j));
           }

        }
       else
         {
            for(int j=i;j>=1;j--)//i=1
            {
              if(j%2!=0)
               System.out.print((char)(64+j));
             else
               System.out.print((char)(96+j));
            }

            for(int j=1;j<=((n-i+1)*2)-3;j++)//i=1
                System.out.print("_"); 

            for(int j=1;j<=i;j++)//i=1
            {
              if(j%2!=0)
               System.out.print((char)(64+j));
             else
               System.out.print((char)(96+j));
            }

          }
        
      System.out.println();
    }
  }
}