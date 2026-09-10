class Diamond_Space2
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
                for(int j=i;j>=1;j--)
                  System.out.print(n-i+1);//i=1 aahe i la 5 banav
               }
             else
               {
                for(int j=i;j>n;j--)//i=6
                  System.out.print("_");
                for(int j=i; j<=(n*2)-1; j++)//i=6//6-4 time loop 6789 
                  System.out.print(i-n+1);//i=6//I a 2 bnav
               } 
        
          System.out.println();
          }  
     }
}