class Diamond_Space6
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
           System.out.print(j);
       }
      else
       {
         for(int j=i;j>n;j--)//6-5
           System.out.print("_");
         for(int j=n;j>=i-n+1;j--)//i=6//j=6-2//5-2
           System.out.print(j);
       }
     System.out.println();
    }
  }
}