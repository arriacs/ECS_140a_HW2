public class CertificateStudent extends Student {
    
    String certificate;

    public static final int fixedFee = 700;

    public static final int creditFee = 300;

    int CalculateAid(int creditHours){

        int regularFee = (creditHours * creditFee) + fixedFee;

        return regularFee;
    }

    String getCertificate(String certificate) {
        switch (certificate) {
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


    public void printData() {

        System.out.println("ID number:" + id);
        System.out.println("Name:   " + firstName);
        System.out.println("Age:    " + age);
        System.out.println(); 
        System.out.println(firstName + " is a non degree-seeking student enrolled in " + creditHours + " credits for a certificate in " + getCertificate(certificate) );
        System.out.println(firstName + " recieves no financial assistance per term" );
        System.out.println(firstName + "'s certificate is" + certificate);

    }
}
