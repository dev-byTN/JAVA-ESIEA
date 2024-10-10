package quizz3;
import java.util.Arrays;

public class Employee implements Comparable <Employee>
{
   private String name;
   private double salary;

   public Employee(String name, double salary)
   {
      this.name = name;
      this.salary = salary;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   @Override
   public int compareTo (Employee value) {

    return Double.compare(this.salary,value.salary);
   }

   public static void main(String[] args) {
    
    var staff = new Employee[3];

    staff[0] = new Employee("Harry Hacker", 35000);
    staff[1] = new Employee("Carl Cracker", 75000);
    staff[2] = new Employee("Tony Tester", 38000);
    
    Arrays.sort(staff);
    
    // print out information about all Employee objects
    for (Employee e : staff)
        System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
  
}
