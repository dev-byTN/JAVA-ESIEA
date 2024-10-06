package TD.TD1;

public class Phrase {
    
    public static void main(String[] args) {
		
		String copy = "Bonjour tout le monde inhere!";
		String[] subArray;
		
		System.out.println("Length of phrase is: "+ copy.length());
		System.out.println("Phrase composed of words:");
		
		subArray = copy.split(" ");
		for ( int i = 0; i < subArray.length; i ++) {
		
			System.out.println(subArray[i]);
		}

		System.out.println("All words lowercase:");
		for ( int i = 0; i < subArray.length; i ++) {
		
			System.out.println(subArray[i].toLowerCase());
		}

		System.out.println("All words uppercase:");
		for ( int i = 0; i < subArray.length; i ++) {
		
			System.out.println(subArray[i].toUpperCase());
		}

		System.out.println("The phrase contains word \"in\":" + copy.contains("in"));
		System.out.println("The phrase ends with \".\":" + copy.endsWith("."));
		System.out.println("The phrase ends with \"!\":" + copy.endsWith("!"));
		System.out.println("The phrase ends with \"?\":" + copy.endsWith("?"));
		System.out.println(copy.replace("in", "out of"));
    }
}
