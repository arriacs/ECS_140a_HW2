public class CertificateStudent extends Student {
    
    char Certificate;

    public static final int fixedFee = 700;

    public static final int creditFee = 300;

    int CalculateAid(int creditHours){

        int regularFee = (creditHours * creditFee) + fixedFee;

        return regularFee;
    }

}
