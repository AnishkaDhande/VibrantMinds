class DiamondSpace8
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
          for(int j=i;j<=n;j++)
             {
               if(i%2!=0)
                   System.out.print((char)(64+i));
               else
                   System.out.print((char)(96+i));
             }  
        }
      else
        {
          for(int j=i;j<(n*2)-1;j++ )//i=6//j=678
             System.out.print("_");
          for(int j=i;j>=n;j-- )//i=6//j=56
             {
               if(i%2!=0)
                   System.out.print((char)(64+((n*2)-i)));//6-4
               else
                   System.out.print((char)(96+((n*2)-i)));
             }  
        }
      System.out.println();
    }
  }
}