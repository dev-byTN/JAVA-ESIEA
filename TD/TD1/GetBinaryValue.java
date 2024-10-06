package TD.TD1;

import java.util.Scanner;


public class GetBinaryValue {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] first = new int[4];
        int i = 0;
        int count = 0;
        int countA = 0;
        String binary;
    
        try {
            first[0] = scanner.nextInt();
            countA++;
        }
        catch ( Exception e ) {
            System.out.println("Usage: java GetBinaryValue  <decimal integer>");
        }

        while(true) {
            
            if ( scanner.hasNextInt()) {
                first[i+1] = scanner.nextInt();
                count++;

                if (first[i+1] != 0) {
                    countA ++;
                }
                i++;
            }
            else {
                scanner.next();
                break;
            }
        
        }
        scanner.close();

        if ( count != 0 ) {
            System.out.println("Received "+ countA + " arguments.");
            System.out.println("The arguments are:");

            for(i = 0; i < first.length; i++) {
                if ( first[i] != 0 ){
                    System.out.println(first[i]);
                }
            }
            binary = Integer.toBinaryString(first[0]);
            System.out.println("The binary representation of "+ first[0] + " is " + binary);
        }
        
        
    }
}

