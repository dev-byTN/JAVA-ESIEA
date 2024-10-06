package TD.TD1;

import java.util.Arrays;

public class Phrase {
    
    public static void main(String[] args) {
		
		String phrase = args[0];
		String[] copy;
		int countW = 0;
		int start = 0;
		int end = 0;
		
		System.out.println("Length of phrase is: "+ phrase.length());
		System.out.println("Phrase composed of words:");
		
		for ( int i = 0; i < phrase.length(); i ++) {
		    
		    if ( phrase[i] == (" ")){
		        copy = Arrays.copyofRange(phrase,start,end);
		        System.out.println(copy);
		        start = i;
		        end = i;
		    }
		    end++;
		}
    }
}
