class CounterAlpha17
{
  public static void main(String args[])
   {
     int n=5;
     int count=1;       
       for(int i=1;i<=n;i++)//i=n;i>=1;i--
        {
           for(int j=i;j<=n;j++)//j=i;j>=1;j--
           {
             System.out.print((char)(64+count));
             count++;
           }
          System.out.println();
        }
   }
}