public class AidStudent extends Student {
        
    String major;

    String academicStanding;

    int aidAmount;

    public static final int maxCredits = 12;

    public static final int maxFee = 3450;

    public static final int generalFee = 150;

    public static final int creditFee = 275;

    //Fee calculation for financial aid students
    int CalculateAid(int creditHours) {
        
        int regularFee;
        if (creditHours > maxCredits) {
            regularFee = maxFee;          
        } else {
            regularFee = (creditHours * creditFee) + generalFee;
        }

        int feeAfterAid = regularFee - aidAmount;

        if (feeAfterAid < 0) return 0;

        return feeAfterAid;
    }

    String getMajorLabel(String major) {
        switch (major) {
            case "S":
                return "Gaming Science";
            case "M":
                return "Hotel Management";
            case "A":
                return "Lounge Arts";
            case "E":
                return "Beverage Engineering";
            default:
                return "Unknown Major";
        }
    }

     String getStanding(String academicStanding) {
        switch (academicStanding) {
            case "G":
                return "Good";
            case "W":
                return "Warning";
            case "P":
                return "Probation";
            default:
                return "Unknown Academic Standing";
        }
    
    
    }


    public void printData() {
        System.out.println("ID number:" + id);
        System.out.println("Name:   " + firstName);
        System.out.println("Age:    " + age);
        System.out.println(); 
        System.out.println(firstName + " is a degree-seeking student enrolled in " + creditHours + " credits" );
        System.out.println(firstName + " recieves $" + String.format("%,d", aidAmount) + " in financial assistance per term" );
        System.out.println(firstName + "'s major is " + getMajorLabel(major));
        System.out.println(firstName + "'s academic standing is " + getStanding(academicStanding));
    }



}