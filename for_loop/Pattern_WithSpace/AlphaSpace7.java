class AlphaSpace7
{
public static void main(String args[])
  {     
    for(int i=1;i<=5;i++ )
     {
        for(int j=i;j>1;j--)//1-1
          {
         System.out.print(" ");
          }
        for(int j=i;j<=5;j++)//5-1
          { 
          System.out.print((char)(i+64)); 
          }
      System.out.println();
     }       
   }
}