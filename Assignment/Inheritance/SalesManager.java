public class SalesManager  extends Employee{
    int target;
    double incentive;
    SalesManager(int eid,String ename,double salary,int target,double incentive)
    {
        super(eid, ename, salary);
        this.target=target;
        this.incentive=incentive;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public double getIncentive() {
        return incentive;
    }
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
    public void display()
    {
        super.display();
        System.out.println("Sales Target: "+target);
        System.out.println("Incentive obtained: "+incentive);
    }
      double calculateSalary()
    {
        return salary+incentive;
    }
}
