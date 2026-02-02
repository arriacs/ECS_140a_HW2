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
            regularFee = maxFee;           // maximum capped fee for 12+ credits
        } else {
            regularFee = (creditHours * creditFee) + generalFee;
        }

        int feeAfterAid = regularFee - aidAmount;

        if (feeAfterAid < 0) return 0;

        return feeAfterAid;
    }



}