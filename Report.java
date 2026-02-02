import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//----------DONT EDIT ABOVE THIS LINE-----------
//packages go here..


public class Report{
    public static String generateReport() {
        
        //Read and parse input data with function
        String hw2 = "C:\\Users\\acts5\\OneDrive\\ECS140a\\hw2.txt";
        
        ParseText parser = new ParseText();
        Student[] students = parser.parse(hw2);
        
        //TODO call printData()
            //your code goes here..


        //----------DONT EDIT BELOW THIS LINE-----------
        //custom stream for report
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        //----------DONT EDIT ABOVE THIS LINE-----------
        
        
        //generate report 1 
        //1 line per student, showing the fees
        for(Student s : students) {
            System.out.println(s.firstName + " " + s.lastName + ": $" + s.fee);
        }


        //TODO generate report 2
        int degreeNoAidTotal = 0;
        int degreeWithAidTotal = 0;
        int certificateTotal = 0;
        int seniorTotal = 0;

        for (Student s : students) {
            if (s instanceof NoAidStudent) {
                degreeNoAidTotal += s.fee;
            } else if (s instanceof AidStudent) {
                degreeWithAidTotal += s.fee;
            } else if (s instanceof CertificateStudent) {
                certificateTotal += s.fee;
            } else if (s instanceof SeniorStudent) {
                seniorTotal += s.fee;
            }
        }

        int totalFees = degreeNoAidTotal + degreeWithAidTotal + certificateTotal + seniorTotal;

        System.out.println("\nSummary of student fees assessed:");
        System.out.println("Degree-seeking students without financial assistance: $" + degreeNoAidTotal);
        System.out.println("Degree-seeking students with financial assistance: $" + degreeWithAidTotal);
        System.out.println("Certificate students: $" + certificateTotal);
        System.out.println("Senior citizens: $" + seniorTotal);
        System.out.println("Total fees assessed: $" + totalFees);


        //----------DONT EDIT BELOW THIS LINE-----------
        //reset stream
        System.out.flush();
        System.setOut(old);
        return baos.toString();
    }
}
