public class HR extends Employee{
    double commision_Percentage;

    HR(int eid,String ename,double salary,double commision_Percentage)
    {
        super(eid, ename, salary);
        if(commision_Percentage<=100)
        this.commision_Percentage=commision_Percentage;
        else
            System.out.println("Please Enter Percentage 100 or below");
    }

    public double getCommision_Percentage() {
        return commision_Percentage;
    }

    public void setCommision_Percentage(double commision_Percentage) {
        this.commision_Percentage = commision_Percentage;
    }
    
   public void display()
    {
        super.display();
        System.out.println("commision_Percentage :"+commision_Percentage);
        
    }
    double calculateSalary()
    {
        return salary+(commision_Percentage/100)*salary;
    }
}
