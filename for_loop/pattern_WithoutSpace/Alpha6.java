class Alpha6
{    
    public static void main(String args[])
     {    int n=5;
       for(int i=n;i>=1;i--)
         {
             for(int j=i;j<=n;j++)//5-5
                 {
             System.out.print((char)(96+j));
                 }
           System.out.println();
          }
      }
}