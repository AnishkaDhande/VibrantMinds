class DoubleCounter8
{
  public static void main(String args[])
  {
    int n=5;
    int count1=n;
    int count2=(n*(n+1))/2;
    for(int i=n,i1=1 ;i>=1 && i1<=n ;i--,i1++)
      {
         int c1=count1;
         int c2=count2;
         for(int j=i,j1=i1 ;j<=n && j1>=1;j++,j1--)
          {
           System.out.print((char)(64+c1));
           System.out.print(c2);
           System.out.print("\t");
             c1-=j+1;
             c2++;
          }
       System.out.println();
        count1+=i-1;
        count2-=i1+1;
      }
  }
}