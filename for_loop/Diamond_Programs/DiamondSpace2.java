class DiamondSpace2
{
    public static void main()
    {
      int n=5;
        for(int i=1;i<=(n*2)-1;i++)
          {
            if(i<=n)
              {
                for(int j=i;j>1;j--)
                   System.out.print("-");
                for(int j=i;j<=n;j++)//1-5
                   System.out.print(j);
              }
            else
              {
                for(int j=i;j<(n*2)-1;j++)//i=6//6-4   6789
                   System.out.print("-");
                for(int j=i;j>=n;j--)//i=6,
                   System.out.print((n*2)-i);//i=6,6-4

              }
        System.out.println();
          }
    }
}