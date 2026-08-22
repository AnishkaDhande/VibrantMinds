class Alpha5
{    
    public static void main(String args[])
     {    int n=5;
       for(int i=5;i>=1;i--)
         {
             for(int j=5;j>=i;j--)//5-5
                 {
             System.out.print((char)(64+j));
                 }
           System.out.println();
          }
      }
}