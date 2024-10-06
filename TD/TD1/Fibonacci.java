package TD.TD1;
import java.util.Scanner;

public class Fibonacci {
    
    static int Fibo (int value) {

        if (value == 0) return 0;
        else if (value == 1) return 1;
        else return Fibo(value - 1) + Fibo(value - 2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int myValue = scan.nextInt();

        System.out.println("Suite Fibonacci de " + myValue + " : " + Fibo(myValue));
    }
}
