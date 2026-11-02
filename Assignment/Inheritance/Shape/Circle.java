public class Circle extends Shape {
    double radius;
   public  Circle(double radius)
    {
        super(3.14*radius*radius);
        this.radius=radius;
    }
   @Override
   public void display() {
    // TODO Auto-generated method stub
    System.out.println("---Circle Information---");
    System.out.println("Radius of Circle is "+radius);
    super.display();
   }

}
