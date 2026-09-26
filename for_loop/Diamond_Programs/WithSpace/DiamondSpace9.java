class DiamondSpace9
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
          for(int j=n-i+1;j>=1;j--)
             {
               if(i%2!=0)
                   System.out.print((char)(64+(n-i+1)));
               else
                   System.out.print((char)(96+(n-i+1)));
             }  
        }
      else
        {
          for(int j=i;j<(n*2)-1;j++ )//i=6//j=678
             System.out.print("_");
          for(int j=i;j>=n;j-- )//i=6//j=56
             {
               if(i%2!=0)
                   System.out.print((char)(64+(i-n+1)));//6-2=6-5+1=2
               else
                   System.out.print((char)(96+(i-n+1)));
             }  
        }
      System.out.println();
    }
  }
}