class Diamond_Space12
{
  public static void main(String args[])
   {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
         {
           for(int j=i;j<n;j++)
             System.out.print("_");
           for(int j=n;j>=n-i+1;j--)
             {
               if(j%2!=0)
                 System.out.print((char)(64+j));
               else
                 System.out.print((char)(96+j));
             }
         }
        else
         {
           for(int j=i;j>n;j--)
             System.out.print("_");
           for(int j=n;j>=i-n+1;j--)//j=5-2=i-n+1//i=6
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