class Student
{
   int rollno;
   String name;
   double percentage;
   Student()
   {
    this.rollno=0;
    name=" ";
    percentage=0.0;
   }
   Student(int rollno,String name,double percentage)
   {
      this.rollno=rollno;
      this.name=name;
      this.percentage=percentage;
   }
}
class Employee{
    int id;
    String name;
    double annual_Salary;
    public Employee(int id, String name, double annual_Salary) {
        this.id = id;
        this.name = name;
        this.annual_Salary = annual_Salary;
    }
    
}
public class Bank {
     void apporove_Loan(Employee e)
        {
          if(e.annual_Salary>1200000)
             System.out.println("Loan Approved 7 lakhs");
          else if(e.annual_Salary>1000000 && e.annual_Salary<=1200000)
             System.out.println("Loan Approved 6 lakhs");
          else if(e.annual_Salary>600000 && e.annual_Salary<=1000000)
             System.out.println("Loan Approved 5 lakhs");
         else if(e.annual_Salary>400000 && e.annual_Salary<=600000)
             System.out.println("Loan Approved 4 lakhs");
         else if (e.annual_Salary<400000) 
            System.out.println("No Loan Approved");
        }

        void apporove_Loan(Student s)
        {
          if(s.percentage>80)
            System.out.println("Loan Approved is 2 lakhs");
          else if(s.percentage>60 && s.percentage<=80)
            System.out.println("Loan Approved is 1 lakhs");
          else if(s.percentage>40 && s.percentage<=60)
            System.out.println("Loan Approved is  50K");
          else 
            System.out.println("No Loan Approved");
        }
    public static void main(String[] args) {
        Student s1=new Student(24,"Krupa",82.56);
        Employee e1=new Employee(12,"Radhika", 420000);
        Bank b1=new Bank();
        
        b1.apporove_Loan(s1);
        b1.apporove_Loan(e1);
    
    }

}
