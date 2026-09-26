class DiamondSpace7
{
 public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)
    {      
      if(i<=n)
        {
          for(int j=i;j>1;j--)
             System.out.print("_");
          for(int j=n;j>=i;j--)  
             System.out.print(j);
        }
      else
        {
          for(int j=i;j<(n*2)-1;j++)//i=6//j=678
             System.out.print("_");
          for(int j=n;j>=(n*2)-i;j--)//i=6//j=5-4//j=6-4
             System.out.print(j);
        }
      System.out.println();
    }
  }
}