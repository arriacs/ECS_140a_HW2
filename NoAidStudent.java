public class NoAidStudent extends Student {
    
    String major;

    String academicStanding;

    public static final int maxCredits = 12;

    public static final int maxFee = 3450;

    public static final int generalFee = 150;

    public static final int creditFee = 275;

    int CalculateAid(int creditHours){

        int regularFee = (creditHours * 275) + generalFee;

        if (creditHours > maxCredits)
            return maxFee;
        
        else
            return regularFee;
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
         System.out.println(firstName + " recieves no financial assistance per term" );

         System.out.println(firstName + "'s major is " + getMajorLabel(major));
         System.out.println(firstName + "'s academic standing is " + getStanding(academicStanding));
    }

}