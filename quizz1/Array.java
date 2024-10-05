//package quizz1;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        // 1. Read the size of the array
        try {
            size = scanner.nextInt();
        }
        catch ( Exception e) {
            System.out.println("cc");
        }
        // 2. Declare and initialize the original array with the read size
        int[] originalArray = new int[size];
        
        // 3. Read array elements from standard input
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // 4. Use Arrays.copyOf() to copy the array
        int[] copiedArray = Arrays.copyOf(originalArray, size);
        
        // 5. Modify an element in the copied array (for demonstration purposes)
        if (size > 2) {
            copiedArray[2] = 99;  // Modifying the third element if it exists
        }
        
        // 6. Print out both arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        scanner.close();
    }
}
