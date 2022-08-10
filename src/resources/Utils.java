package resources;

public class Utils {
    public static boolean isInteger(String strNum) {
        if (strNum == null || strNum.isEmpty() || strNum.isBlank()) { return false; }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
