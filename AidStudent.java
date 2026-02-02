public class AidStudent extends Student {
        
    String major;

    String academicStanding;

    int aidAmount;

    public static final int maxCredits = 12;

    public static final int maxFee = 3450;

    public static final int generalFee = 150;

    public static final int creditFee = 275;

    //Fee calculation for financial aid students
    int CalculateAid(int creditHours){

        int regularFee = (creditHours * 275) + generalFee;

        int aidFee = regularFee - aidAmount;

        if (creditHours > maxCredits)
            return maxFee;
        
        else
            return aidFee;
    }



}