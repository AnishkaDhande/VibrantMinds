class Symmetric3
{
  public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
    {
      if(i<=n)
        {
          for(int j=n-i+1;j>=1;j--)
            System.out.print(j);
        }
      else
        {
          for(int j=i-n+1;j>=1;j--)//i=6//j=6 che 2 banv
            System.out.print(j);
        }
     System.out.println();
    }
  }
}