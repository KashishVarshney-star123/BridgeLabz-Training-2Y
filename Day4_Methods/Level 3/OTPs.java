import java.util.HashSet;

public class OTPs {
    public static void main(String[] args) {
        System.out.println("--- Generating Unique OTPs ---");
        int[] otps = generateUniqueOTPs(10);
        
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
    public static int generate6DigitOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static int[] generateUniqueOTPs(int count) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        while (uniqueOTPs.size() < count) {
            uniqueOTPs.add(generate6DigitOTP());
        }
        int[] otpArray = new int[count];
        int i = 0;
        for (Integer otp : uniqueOTPs) {
            otpArray[i++] = otp;
        }
        return otpArray;
    }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueChecker = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueChecker.add(otp)) {
                return false;
            }
        }
        return true;
    }
}