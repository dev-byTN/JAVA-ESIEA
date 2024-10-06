package TD.TD1;
import java.util.Scanner;

public class StringB2 {
    
    public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    String[] first = new String[20];
	    StringBuilder builder = new StringBuilder();
	    int i = 0;
        String stop = "*";
	    
	    while ( true ) {
	        
	        first[i] = scan.nextLine();
            
	        if ( first[i].equals(stop)) {
                break;
            }
            builder.append(first[i]);
	        i++;
	    }
	    scan.close();
        
        String result = builder.toString();
        System.out.println(result);
	}
}
