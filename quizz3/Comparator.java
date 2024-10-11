package quizz3;

import java.util.Scanner;
import java.util.Arrays;

public class Comparator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of strings
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left over
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            
            strings[i] = scanner.nextLine();

        }
        Arrays.sort(strings, (a,b)->a.length() - b.length());
        // sort strings using Arrays.sort
        System.out.println(Arrays.toString(strings));

        
        // print strings using Arrays.toString()
        
    }
}
