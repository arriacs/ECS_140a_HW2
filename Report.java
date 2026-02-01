import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
//----------DONT EDIT ABOVE THIS LINE-----------
//packages go here..


public class Report{
    public static String generateReport() {
        //TODO process input data
            //your code goes here..


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
