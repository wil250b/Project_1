public class Util {
    private String strIn;

    public Util(String strIn) {
        this.strIn = strIn;
    }
    public static String toTitleCase(String strIn) {
        String firstUpper = strIn.toUpperCase().substring(0, 1);
        String first = strIn.toLowerCase().substring(1, strIn.charAt(' '));
        String lastUpper = strIn.toUpperCase().substring(strIn.charAt(' ') + 1, strIn.charAt(' ') + 2);
        String last = strIn.toLowerCase().substring(strIn.charAt(' ') + 2);

        String strOut;
        return strOut = firstUpper + first + lastUpper + last;
    }
}
