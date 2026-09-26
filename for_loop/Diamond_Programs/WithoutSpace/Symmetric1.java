class Symmetric1
{
  public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
          {
            for(int j=i;j<=n;j++)
              System.out.print("*");  
          }
        else
          {
            for(int j=i;j>=n;j--)//i=6//j=2-5
              System.out.print("*");
          }
         System.out.println();
      }
  }
}