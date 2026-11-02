public class Bus extends Vehicle {
    int seatingCapacity;

    public Bus(String brand, String fuelType, double speed, int seatingCapacity) {
        super(brand, fuelType, speed);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("----Bus Information----");
        super.display();
        System.out.println("Seating Capacity "+seatingCapacity);
    }
    @Override
    public void brake() {
          System.out.println(brand+" applies heavy-duty Air brake. ");

    }
}
