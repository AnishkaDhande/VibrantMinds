public class GeometricShape {
    public static void main(String[] args) {
        Shape s1=new Circle(2.1);
        Shape s2=new Rectangle(4, 2);
        Shape s3=new Triangle(2.1, 4.2);

        s1.display();
        s2.display();
        s3.display();
    }
}
