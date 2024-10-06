package quizz2;
import java.time.*;

class Employee{

   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee(String name, double salary, int year, int month, int day)   {

      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public LocalDate getHireDay() {
      return hireDay;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}

class Manager extends Employee {
    
   private double bonus;

   public double getSalary() {

      return super.getSalary() + bonus;
   }

   public Manager(String name, double salary, int year, int month, int day)   {

       super(name, salary, year, month, day);
       bonus = 0;

   }
   
   public void setBonus(double myBonus) {

      this.bonus = myBonus;
   }
}