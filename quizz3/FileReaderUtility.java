package quizz3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderUtility {

    public static String readFile(String filename) throws FileNotFoundException{

        File filee = new File(filename); 
        Scanner scan = new Scanner(filee);
        StringBuilder content = new StringBuilder();

        while( scan.hasNextLine()) {

            content.append(scan.next()).append("\n");
        }
        scan.close();

        return content.toString().trim();
    }

    public static void main(String[] args) {
        
        	
    try{
         System.out.println(FileReaderUtility.readFile("sample.txt"));
        }
        catch (Throwable t)
        {
         System.out.println(t.getClass().getName() + ": " + t.getMessage());
        }

        }
    
}
