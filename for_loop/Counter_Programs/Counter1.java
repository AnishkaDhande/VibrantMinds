class Counter1
{ 
    public static void main(String args[])
     {
        int n=5;
        int count=1;
        for(int i=1; i<=5; i++)
         {
           
            for(int j=i;j>=1;j--)
               {
                   System.out.print(count);
                   System.out.print("\t");
                    count++;
                }
               System.out.println();
          }
     }
}