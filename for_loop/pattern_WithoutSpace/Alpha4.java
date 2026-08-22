class Alpha4
{    
    public static void main(String args[])
     {    int n=5;
       for(int i=1;i<=n ;i++)
         {
             for(int j=i; j>=1;j--)//1-1
                 {
             System.out.print((char)(96+j));
                 }
           System.out.println();
          }
      }
}