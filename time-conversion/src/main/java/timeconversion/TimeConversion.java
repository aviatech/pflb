package timeconversion;

public class TimeConversion {
    public static String to24format(String string) {
        String hours = string.substring(0, 2);
        if (string.contains("PM") && Integer.valueOf(hours) < 12) {
            hours = String.valueOf(Integer.valueOf(hours) + 12);
        } else if (hours.equals("12") && string.contains("AM")) {
            hours = "00";
        }
        string = string.substring(2, 8);
        return (hours + string);
    }
}
