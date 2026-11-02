public class Triangle extends Shape {
    double height,base;

    public Triangle(double height, double base) {
        super(0.5*base*height);
        this.height = height;
        this.base = base;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("---Triangle Information---");
        System.out.println("Height of Rectangle "+height);
        System.out.println("Base of Rectangle "+base);
        super.display();
    }
    
    
    
}
