import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//----------DONT EDIT ABOVE THIS LINE-----------
//packages go here..


public class Report{
    public static String generateReport() {
        
        //Read and parse input data using delimiter ";"
        String delim = ";";

        try{
            Scanner scanner = new Scanner(new File("hw2.txt"));
            while(scanner.hasNextLine()) {
                //save line to a student variable
                String student = scanner.nextLine();
                
            }
        }
        


        //TODO call printData()
            //your code goes here..


        //----------DONT EDIT BELOW THIS LINE-----------
        //custom stream for report
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        //----------DONT EDIT ABOVE THIS LINE-----------
        
        
        //TODO generate report 1 
            //your code goes here..


        //TODO generate report 2
            //your code goes here..


        //----------DONT EDIT BELOW THIS LINE-----------
        //reset stream
        System.out.flush();
        System.setOut(old);
        return baos.toString();
    }
}
