package quizz2;
import java.time.LocalDate;
import java.util.Objects;

public class Equals{

   private String name;
   private double salary;
   private LocalDate hireDay;

   public Equals (String name, double salary, int year, int month, int day) {
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName(){
      return name;
   }

   public double getSalary(){
      return salary;
   }

   public LocalDate getHireDay(){
      return hireDay;
   }

   public void raiseSalary(double byPercent){
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   
   public int hashCode() {
      return Objects.hash(name,salary,hireDay);
   }
   
   public boolean equals(Object myObject) {

      if(this == myObject) return true;

      Equals user = (Equals) myObject;
      return (name.equals(user.name) &&
         salary == user.salary &&
         hireDay.equals(user.hireDay));
   }

   public String toString() {
      return "Equals[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
   }
        
}

   class SubEquals extends Equals {

      private double bonus;

      public SubEquals(String name, double salary, int year, int month, int day)
      {
         super(name, salary, year, month, day);
         bonus = 0;
      }

      public double getSalary()
      {
         double baseSalary = super.getSalary();
         return baseSalary + bonus;
      }

      public void setBonus(double bonus)
      {
         this.bonus = bonus;
      }

      public String toString()
      {
         return super.toString() + "[bonus=" + bonus + "]";
      }
      
      public int hashCode() {
         return java.util.Objects.hash(super.hashCode(), bonus);
      }
      
      public boolean equals(Object otherObject) {

         if (!super.equals(otherObject)) return false;
         SubEquals other = (SubEquals) otherObject;
         // super.equals checked that this and other belong to the same class
         return bonus == other.bonus;
      }
   

      public static void main(String[] arg) {

         Equals carl = new Equals("Carl Cracker", 80000, 1987, 12, 15);
         System.out.println("carl .toString(): " + carl );

         Equals alice1 = new Equals("Alice Adams", 75000, 1987, 12, 15);
         Equals alice2 = alice1;
         Equals alice3 = new Equals("Alice Adams", 75000, 1987, 12, 15);
         Equals alice4 = new Equals("Alice Adams", 76000, 1987, 12, 15);
         System.out.println("alice1 == alice2: " + (alice1 == alice2));
         System.out.println("alice1 == alice3: " + (alice1 == alice3));

         System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
         System.out.println("alice1.hashCode() == alice3.hashCode(): " + (alice1.hashCode() == alice3.hashCode()));

         System.out.println("alice1.equals(alice4): " + alice1.equals(alice4));
         System.out.println("alice1.hashCode() == alice4.hashCode(): " + (alice1.hashCode() == alice4.hashCode()));

         SubEquals carl2 = new SubEquals("Carl Cracker", 80000, 1987, 12, 15);
         SubEquals boss = new SubEquals("Carl Cracker", 80000, 1987, 12, 15);
         boss.setBonus(5000);

         System.out.println("boss.toString(): " + boss);
         System.out.println("carl.equals(boss): " + carl2.equals(boss));
         System.out.println("boss.equals(carl): " + boss.equals(carl));
         System.out.println("carl.hashCode() == boss.hashCode(): " + (carl.hashCode() == boss.hashCode()));
      }
   }
