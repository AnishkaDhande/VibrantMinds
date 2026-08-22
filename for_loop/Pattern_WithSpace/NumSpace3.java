class NumSpace3
{
public static void main(String args[])
  {     
    for(int i=1;i<=5;i++)
     {
        for(int j=i; j<5; j++)//1-5
          {
         System.out.print(" ");
          }
        for(int j=1; j<=i ;j++)
          {
          System.out.print(j); 
          }
      System.out.println();
     }       
   }
}