class AlphaSpace2
{
public static void main(String args[])
  {     
    for(int i=5; i>=1; i--)
     {
        for(int j=i; j>1; j--)//
          {
         System.out.print(" ");
          }
        for(int j=i; j<=5;j++ )//
          { 
          System.out.print((char)(i+96)); 
          }
      System.out.println();
     }       
   }
}