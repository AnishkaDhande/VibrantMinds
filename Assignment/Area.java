import java.util.Scanner;
class Area
{
  double circleArea(int r)
    {
      double a=3.14*r*r;
      return a;
    }
  int RectangleArea(int l,int b)
    {
     int a=l*b;
      return a;  
    }
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
     Area a1=new Area();
    do{
      System.out.println("To find area of circle Enter 1");
      System.out.println("To find area of Rectangle Enter 2");
      int c=sc.nextInt();
        switch(c)
       {
         case 1:
              System.out.print("Area of Circle is : ");
              System.out.print(a1.circleArea(5));
              break;

         case 2:
              System.out.print("Area of Rectangle is : ");
              System.out.print(a1.RectangleArea(4,8));
              break;
 
         default:
             System.out.print("Invalid Input");
       }
    }while(false);

  }
}