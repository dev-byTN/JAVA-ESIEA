import java.time.LocalDate;
import java.util.Scanner;

public class Local_Date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read a date string in format YYYY-MM-DD
        String inputDate = scanner.nextLine();
        
        // 2. Parse the date string to create a LocalDate object
        LocalDate date = LocalDate.parse(inputDate);
         
        // 3. Add 10 days to the date
        LocalDate incrementedDate = date.plusDays(10); 
        
        // 4. Subtract 5 days from the date
        LocalDate decrementedDate = date.minusDays(5); 
        
        // 5. Print the incremented and decremented dates
        System.out.println(date);
        System.out.println(incrementedDate);
        System.out.println(decrementedDate);

        scanner.close();
    }
}
