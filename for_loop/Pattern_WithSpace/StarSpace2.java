class StarSpace2
{
public static void main(String args[])
  {     
    for(int i=5;i>=1;i--)//for loop for row
     {
        for(int j=i; j<5; j++)//for loop for Space
          {
         System.out.print(" ");
          }
        for(int j=i; j>=1; j--)//5-5
          {
          System.out.print("*");//for loop for col 
          }
      System.out.println();
     }       
   }
}