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
    
}
