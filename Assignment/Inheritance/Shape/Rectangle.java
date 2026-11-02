public class Rectangle extends Shape {
 int l,b;
    public Rectangle(int l,int b) {

        super(l*b);
        this.l=l;
        this.b=b;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("---Rectangle Information---");
        System.out.println("Length of Rectangle "+l);
        System.out.println("Breadth of Rectangle "+b);
        super.display();
    }
    
}
