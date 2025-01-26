



import java.text.DecimalFormat;

public class Converter {
    public String toPounds(int ounces) {
        DecimalFormat df = new DecimalFormat("0.0000");
        String poundsString = "";
        double pounds = ounces / 16.0;
        poundsString += df.format(pounds) + " lb";
        if(pounds != 1) {
            poundsString += 's';
        }
        return poundsString;
    }

    public String toPoundsAndOunces(int ounces) {
        String poundsAndOunces = "";
        int pounds = ounces / 16;
        int ouncesLeft = ounces % 16;
        poundsAndOunces += pounds + " lb";
        if(pounds != 1) {
            poundsAndOunces += 's';
        }
        poundsAndOunces += ' ';
        poundsAndOunces += ouncesLeft + " oz";
        return poundsAndOunces;
    }

/*    public static String toPoundsAndOunces(int ounces) {
        String poundsAndOunces = "";
        int pounds = ounces / 16;
        int ouncesLeft = ounces % 16;
        if(pounds != 0) {
            poundsAndOunces += pounds + " lb";
            if(pounds != 1) {
                poundsAndOunces += 's';
            }
        }
        if(pounds != 0 && ouncesLeft != 0) {
            poundsAndOunces += " and ";
        }
        if(ouncesLeft != 0 || pounds == 0) {
            poundsAndOunces += ouncesLeft + " oz";
        }
        return poundsAndOunces;
    }*/

    public String toOunces(int pounds, int ouncesLeft) {
        String ouncesString = "";
        int ounces = pounds * 16 + ouncesLeft;
        ouncesString += ounces + " oz";
        return ouncesString;
    }
}
