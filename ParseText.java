import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseText {

    String delim = ";";
    String hw2;
    Student[] students = new Student[100]; //array of student info

    //takes the studentInfo string, parses it
    Student studentType(String[] studentInfo){

        //AidStudent
        if (studentInfo.length > 9 && studentInfo[5].equals("Y") && studentInfo[8].equals("Y")){

            AidStudent aid = new AidStudent();
            aid.id = studentInfo[0];
            aid.firstName = studentInfo[1];
            aid.lastName = studentInfo[2];
            aid.age = studentInfo[3];
            aid.creditHours = Integer.parseInt(studentInfo[4]);
            aid.major = studentInfo[6];
            aid.academicStanding = studentInfo[7];
            aid.aidAmount = Integer.parseInt(studentInfo[9]);
            aid.fee = aid.CalculateAid(aid.creditHours);
            return aid;
        }

        //NoAidStudent
        else if (studentInfo.length > 8 && studentInfo[5].equals("Y") && studentInfo[8].equals("N")){

            NoAidStudent noAid = new NoAidStudent();
            noAid.id = studentInfo[0];
            noAid.firstName = studentInfo[1];
            noAid.lastName = studentInfo[2];
            noAid.age = studentInfo[3];
            noAid.creditHours = Integer.parseInt(studentInfo[4]);
            noAid.major = studentInfo[6];
            noAid.academicStanding = studentInfo[7];
            noAid.fee = noAid.CalculateAid(noAid.creditHours);
            
            return noAid;
        }

        //SeniorStudent
        else if (studentInfo.length >= 7 && studentInfo[5].equals("N") && studentInfo[6].equals("S")){

            SeniorStudent senior = new SeniorStudent();
            senior.id = studentInfo[0];
            senior.firstName = studentInfo[1];
            senior.lastName = studentInfo[2];
            senior.age = studentInfo[3];
            senior.creditHours = Integer.parseInt(studentInfo[4]);
            senior.fee = senior.CalculateAid(senior.creditHours); 
            
            return senior;
        }

        //CertificateStudent
        else {
            CertificateStudent certificate = new CertificateStudent();
            certificate.id = studentInfo[0];
            certificate.firstName = studentInfo[1];
            certificate.lastName = studentInfo[2];
            certificate.age = studentInfo[3];
            certificate.creditHours = Integer.parseInt(studentInfo[4]);
            certificate.certificate = studentInfo[7];
            certificate.fee = certificate.CalculateAid(certificate.creditHours);
            return certificate;
        }

    }
    
    //function calling the parser, creating the student objects, 
    //and adding them to the final array
    Student[] parse(String file){

        int i = 0;

        try{
            Scanner scanner = new Scanner(new File(file));
            while(scanner.hasNextLine()) {

                //save line to a student variable
                String student = scanner.nextLine();

                // split string and return array of components
                String[] studentInfo = student.split(delim);

                //add new class to student array
                Student s = studentType(studentInfo);
                if (s != null) {
                    students[i] = s;
                    i++;
                } else {
                    System.out.println("incorrect input:" + String.join(";", studentInfo));
                }
              
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Student[] result = new Student[i];
        System.arraycopy(students, 0, result,0, i);
        return result;
    }
}
