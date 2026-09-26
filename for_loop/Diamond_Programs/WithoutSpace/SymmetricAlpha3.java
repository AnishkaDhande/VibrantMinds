class SymmetricAlpha3
{
  public static void main(String args[])
  {
    int n=5; 
    for(int i=1;i<=(n*2)-1;i++)
    {
      if(i<=n)
         {
           for(int j=n-i+1;j>=1;j--)
              {
                if(i%2!=0)
                  System.out.print((char)(64+i));
                else
                  System.out.print((char)(96+i));
              }
         }
      else
         {
           for(int j=i-n+1;j>=1;j--)
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