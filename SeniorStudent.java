public class SeniorStudent extends Student {

    public static final int sixCredits = 7;

    public static final int lessCredits = 100;

    public static final int moreCredits = 50;

    int CalculateAid(int creditHours){

        if (creditHours < sixCredits)
            return lessCredits;
        
        else
            return (lessCredits + (creditHours - 6) * moreCredits);
    }
    
    public void printData() {
        System.out.println("ID number:" + id);
        System.out.println("Name:   " + firstName);
        System.out.println("Age:    " + age);
        System.out.println(); 
        System.out.println(firstName + " is a non degree-seeking student enrolled in " + creditHours + " credits as a senior" );
        System.out.println(firstName + " recieves no financial assistance per term" );
    }

}

