class Diamond_Space4
{
    public static void main(String args[])
     {
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
         {
           if(i<=n)
             {
                for(int j=i;j<n;j++)
                   System.out.print("-");
                for(int j=1;j<=i;j++)//i=1,1-5
                  System.out.print(j);
             }
           else
             {
                for(int j=i;j>n;j--)//i=6
                   System.out.print("-");
                for(int j=1;j<=(n*2)-i;j++)//i=6,6789
                   System.out.print(j);//i=6,
             }
         System.out.println();
         }
     }
}