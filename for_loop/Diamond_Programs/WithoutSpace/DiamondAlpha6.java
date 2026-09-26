class DiamondAlpha6
{
  public static void main(String args[])
   {
     int n=5;
     for(int i=1;i<=(n*2)-1;i++)
      {
        if(i<=n)
          {
            for(int j=n-i+1;j<=n;j++)//5-5
              {
                if(i%2!=0)
                  System.out.print((char)(64+(n-i+1)));
                else 
                  System.out.print((char)(96+(n-i+1)));
              }
          }
        else
          {
            for(int j=i-n+1;j<=n;j++)//i=6//j=2 to 5
              {
                if(i%2!=0)
                  System.out.print((char)(64+(i-n+1)));
                else 
                  System.out.print((char)(96+(i-n+1)));
              }
          }
        System.out.println();
      }
   }
}