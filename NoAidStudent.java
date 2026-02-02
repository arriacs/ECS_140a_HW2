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

}