public abstract class Employee {
    int eid;
    String ename;
    double salary;
  Employee(int eid,String ename,double salary)
  {
    this.eid=eid;
    this.ename=ename;
    this.salary=salary;
  }
  
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public void setEid(int eid) {
    this.eid = eid;
  }
  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getEid() {
    return eid;
  }

  public String getEname() {
    return ename;
  }

  public double getSalary() {
    return salary;
  }

  abstract double calculateSalary();
  
  public void display()
  {
    System.out.println("Employee id: "+eid);
    System.out.println("Employee ename: "+ename);
    System.out.println("Total salary: "+this.calculateSalary());
  } 
  
  public static void main(String[] args) {
    Employee e1=new HR(12,"Krishna",42000,20);
    Employee e2=new SalesManager(23,"Aman" , 32000, 230, 4000);
    Employee e3=new Admin(42,"Anishka",65000,23000);
    e1.display();
    e2.display();
    e3.display();;
  }
}
