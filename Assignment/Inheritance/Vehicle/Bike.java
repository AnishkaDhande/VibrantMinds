public class Bike extends Vehicle {
    int noOfGears;
    Bike(String brand ,String fuelType,double speed,int noOfGears)
    {
       super(brand, fuelType,speed);
       this.noOfGears=noOfGears;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("----Bike Information----");
        super.display();
        System.out.println("Number Of Gears : "+noOfGears);
    }
    @Override
    public void brake() {
        // TODO Auto-generated method stub
               System.out.println(brand+" applies hand and foot brake. ");

    }
}
