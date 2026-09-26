class Diamond_Space9
{
  public static void main(String args[])
  {
    int n=5;
   for(int i=1;i<=(n*2)-1;i++)
     {
      if(i<=n)
        {
         for(int j=i;j<n;j++)
           System.out.print("_");
         for(int j=n-i+1;j<=n;j++)
           {
            if(i%2!=0)
              System.out.print((char)(64+i));
            else
              System.out.print((char)(96+i));
           }
        }
      else
        {
          for(int j=i;j>n;j--)
            System.out.print("_");
          for(int j=i;j<=(n*2)-1;j++)//i=6//j=6789
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