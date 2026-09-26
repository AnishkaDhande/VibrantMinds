class Diamond4
{
  public static void main(String args[])
   {
     int n=5;
     for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
         {
          for(int j=n-i+1 ;j<=n;j++)
            System.out.print(n-i+1);
         }
        else
         {
          for(int j=i-n+1 ;j<=n;j++ )//i=6-2//j=6-5+1=2
            System.out.print(i-n+1);
         }
     System.out.println();
      }
   }
}