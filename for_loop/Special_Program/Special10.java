class Special10
{
  public static void main(String args[])
  {
     int n=5;
     char p='A';
  // int c=1; 
    for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=i;j++)
         {
           if(j%2!=0)
             System.out.print(1);
           else
               System.out.print(p++);
             //System.out.print((char)(64+c++));
         }
       System.out.println();
     }
  }
}