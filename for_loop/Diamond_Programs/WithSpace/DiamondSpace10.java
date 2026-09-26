class DiamondSpace10
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
          for(int j=1;j<=n-i+1;j++)
             {
               if(j%2!=0)
                   System.out.print((char)(64+j));
               else
                   System.out.print((char)(96+j));
             }  
        }
      else
        {
          for(int j=i;j<(n*2)-1;j++)//i=6//j=678
             System.out.print("_");
          for(int j=1;j<=i-n+1;j++)//i=6//j=56
             {
               if(j%2!=0)
                   System.out.print((char)(64+j));
               else
                   System.out.print((char)(96+j));
             }  
        }
      System.out.println();
    }
  }
}