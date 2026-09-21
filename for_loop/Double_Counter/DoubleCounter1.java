class DoubleCounter1
{
  public static void main(String args[])
   {
     int n=5;
     int count1=1;//seq aahe
     int count2=(n*(n+1))/2;//seq aahe
       for(int i=1;i<=n;i++)
        {
          for(int j=i;j<=n;j++)
           {
            System.out.print((char)(64+count1));
            System.out.print((char)(96+count2));
            System.out.print("\t");
            count1++;
            count2--;
           }
          System.out.println();
         }
   }
}