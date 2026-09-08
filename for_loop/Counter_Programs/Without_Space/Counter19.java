class Counter19
{
 public static void main(String args[])
   {
       int n=5;
       int count=(n*(n+1))/2-(n-1);//(n*(n-1))/2+1
      for(int i=5;i>=1;i--)
        {
           int c=count;
          for(int j=i;j>=1;j--)
            {
             
             System.out.print(c);
             System.out.print("\t");
             c++;
            }
         System.out.println();
          count-=(i-1);
        }
    }
}