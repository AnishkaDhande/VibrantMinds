public class Admin extends Employee{
    double allowance;

    public Admin(int ei, String ename, double salary, double allowance) {
        super(ei, ename, salary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    public void display()
    {
        super.display();
        System.out.println("Allowance : "+allowance);
    }
    double calculateSalary()
    {
        return salary+allowance;
    }
}
