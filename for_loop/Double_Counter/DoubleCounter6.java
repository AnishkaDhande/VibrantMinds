class DoubleCounter6
{
  public static void main()
  {
    int n=5;
    int count1=1;
    int count2=(n*(n+1))/2;
    for(int i=1,i1=n ;i<=n && i1>=1; i++,i1--)
      {
        int c1=count1;
        int c2=count2;
        for(int j=i,j1=i1 ;j>=1 && j1<=n ;j--,j1++)
         {
          System.out.print((char)(64+c1));
          System.out.print(c2);
          System.out.print("\t");
           c1--;
           c2+=j1;
         }
     System.out.println();
         count1+=i+1;
         count2-=i1;
      }
  }
}