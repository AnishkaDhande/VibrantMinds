class MirrorAlpha11
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=n;i>=1;i--)
    {
      if(i==1)
        {
          for(int j=1;j<=n;j++)//1-5
           {
            if(j%2!=0)
               System.out.print((char)(64+j));
           else
               System.out.print((char)(96+j));
           }

          for(int j=n-1;j>=1;j--)//4-1
           {
            if(j%2!=0)
               System.out.print((char)(64+j));
           else
               System.out.print((char)(96+j));
           }

        }
       else
         {
            for(int j=i;j<=n;j++)//i=5
            {
              if(j%2!=0)
               System.out.print((char)(64+j));
             else
               System.out.print((char)(96+j));
            }

            for(int j=1;j<=(i*2)-3;j++)//i=5
                System.out.print("_"); 

            for(int j=n;j>=i;j--)//i=5
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