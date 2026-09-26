class SymmetricAlpha4
{
  public static void main(String args[])
   {
     int n=5;
     for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
          {
            for(int j=n;j>=i;j--)
              {
                if(j%2!=0)
                  System.out.print((char)(64+j));
                else
                  System.out.print((char)(96+j));
              }
          }
        else
          {
             for(int j=n;j>=(n*2)-i;j--)//i=6//j=6-4//5-4
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