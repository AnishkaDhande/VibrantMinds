class Symmetric5
{
  public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
          {
            for(int j=n;j>=i;j--)
              System.out.print(j);
          }
        else
          {
            for(int j=n;j>=(n*2)-i;j--)//i=6//j=5-4//10-6=4
              System.out.print(j);
          }
     System.out.println();
      }
  }
}