class NumSpace2
{
public static void main(String args[])
  {     
    for(int i=5;i>=1;i--)
     {
        for(int j=i; j>1 ;j-- )//5-1
          {
         System.out.print(" ");
          }
        for(int j=i;j<=5;j++)//5-5
          {
          System.out.print(i); 
          }
      System.out.println();
     }       
   }
}