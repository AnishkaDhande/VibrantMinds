class SymmetricAlpha5
{
  public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
     {
       if(i<=n)
         {
           for(int j=i;j<=n;j++)
             {
               if(j%2!=0)
                 System.out.print((char)(64+j));
               else
                 System.out.print((char)(96+j));
             }
         }
       else
         {
           for(int j=(n*2)-i;j<=n;j++)//i=6//j=6-4
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