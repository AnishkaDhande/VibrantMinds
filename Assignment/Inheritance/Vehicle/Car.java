public class Car extends Vehicle{
    int numberOfDoors;

   
    public Car(String brand, String fuelType, double Maxspeed, int numberOfDoors) {
        super(brand, fuelType, Maxspeed);
        this.numberOfDoors = numberOfDoors;
    }

   @Override
   public void brake() {
       // TODO Auto-generated method stub
       System.out.println(brand+" applies hydrualic disc brake. ");
   }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("----Car Information----");
        super.display();
        System.out.println("Number of Doors : "+numberOfDoors);
    }
    
    
}
