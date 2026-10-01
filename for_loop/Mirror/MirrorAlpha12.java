class MirrorAlpha12
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=n;i>=1;i--)
    {
      if(i==1)
        {
          for(int j=1;j<=(n*2)-1;j++)//1-5
           {
            if(i%2!=0)
               System.out.print((char)(64+i));
           else
              System.out.print((char)(96+i));
           }
        }
       else
         {
            for(int j=i;j<=n;j++)//i=5
            {
              if(i%2!=0)
               System.out.print((char)(64+i));
             else
               System.out.print((char)(96+i));
            }

            for(int j=1;j<=(i*2)-3;j++)//i=5
                System.out.print("_"); 

            for(int j=i;j<=n;j++)//i=5
            {
              if(i%2!=0)
               System.out.print((char)(64+i));
             else
               System.out.print((char)(96+i));
            }

          }
        
      System.out.println();
    }
  }
}