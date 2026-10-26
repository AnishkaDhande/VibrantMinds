public class Shape {
    void area(double r)
    {
        System.out.println("Area of Circle is "+(3.14*r*r));
    }
    void area(double b,double h)
    {
        System.out.println("Area of triangle is "+(0.5*b*h));
    }
    void area(int l,int b)
    {
        System.out.println("Area of Rectangle is "+(l*b));
    }
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.area(4);
        s1.area(4,5);
        s1.area(2,3);
        s1.area(4.2,3);
    }
}
