



public class IO {
    final static String numericChars = "1234567890";
    final static String blankSpaceChars = "\t\n ";
    public static boolean isBlankSpace(char c) {
        for(int i = 0; i < blankSpaceChars.length(); ++i) {
            if(c == blankSpaceChars.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isNumber(char c) {
        for(int i = 0; i < numericChars.length(); ++i) {
            if(c == numericChars.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isNumber(String s) {
        if(s.isBlank()) {
            return false;
        }

        int i = 0;
        if(s.charAt(0) == '-') {
            ++i;
        }

        boolean decimal = false;
        for(; i < s.length(); ++i) {
            if(!isNumber(s.charAt(i))) {
                if(s.charAt(i) == '.' && !decimal) {
                    decimal = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean isInt(String s) {
        if(s.isBlank()) {
            return false;
        }

        int i = 0;
        if(s.charAt(0) == '-') {
            ++i;
        }

        for(; i < s.length(); ++i) {
            if(!isNumber(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
