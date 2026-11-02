public abstract class Shape { 
    double area;

    public Shape(double area) {
        this.area = area;
    }
   public void display()
   {
    System.out.println("Area : "+area);
   }
}
