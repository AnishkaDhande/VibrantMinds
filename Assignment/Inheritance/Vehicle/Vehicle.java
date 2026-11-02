 abstract class  Vehicle {
    String brand;
    String fuelType;
    double Maxspeed;
    public Vehicle(String brand, String fuelType, double Maxspeed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.Maxspeed = Maxspeed;
    }
  public void display()
  {
     System.out.println("Brand Name : "+brand);
     System.out.println("Fuel Type : "+fuelType);
     System.out.println("speed : "+Maxspeed);
  }
  public abstract void brake();
  
  public static void main(String[] args) {
    Vehicle v1=new Car("XUV","Diesel",180,4);
    Vehicle v3=new Bus("Ashok Layland","Diesel",260,53);
    Vehicle v2=new Bike("Honda", "Petrol", 180, 5);
    v1.display();
    v1.brake();

    v2.display();
    v2.brake();

    v3.display();
    v3.brake();
  }
}
