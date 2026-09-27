class PyramidAlpha5
{
 public static void main(String args[])
 {
   int n=5;
  for(int i=n;i>=1;i--)
   {
     for(int j=i;j>1;j--)
        System.out.print("_");

     for(int j=1;j<=((n-i+1)*2)-1;j++)//i=5//j=1-1=5-5+1=1
       {
         if(i%2!=0)
           System.out.print((char)(64+i));
         else
           System.out.print((char)(96+i));
      }
     System.out.println();
   }
 }
}