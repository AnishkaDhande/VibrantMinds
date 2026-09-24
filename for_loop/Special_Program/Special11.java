class Special11
{
  public static void main(String args[])
   {
     int n=5;
     int c=(n*n)/4;
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=i;j++)
           {
             if(j%2!=0)
               System.out.print(1);
             else
               System.out.print((char)(64+c--));
           }
         System.out.println();
       }
   }
}