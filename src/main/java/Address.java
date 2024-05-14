import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String province, String postalCode, String country) {
        this.streetNo = streetNo;
        this.street = street;
        this.province = province;
        if (isPostalCodeValid(postalCode)) {
            this.postalCode = postalCode;
        } else {
            this.postalCode = null;
        }
        this.country = country;
    }

    /**
 * Takes the postalCode and checks if it is valid (not null, six or seven digits, follows proper format)
 * @param postalCode
 * @return true if postal code is valid
 */
public boolean isPostalCodeValid(String postalCode) {
    boolean valid = false;

    //if (postalCode == null) { //to review
    //} else if (postalCode.length() != 6 && postalCode.length() != 7) {
    //    validOrNot = false;
    //} else {
    if (postalCode.length() == 6) {
        //letters
        boolean check1 = (Character.isLetter(postalCode.charAt(0)));
        boolean check2 = (Character.isLetter(postalCode.charAt(2)));
        boolean check3 = (Character.isLetter(postalCode.charAt(4)));

        //numbers
        boolean check4 = (Character.isLetter(postalCode.charAt(1)));
        boolean check5 = (Character.isLetter(postalCode.charAt(3)));
        boolean check6 = (Character.isLetter(postalCode.charAt(5)));

        if (check1 && check2 && check3 && check4 && check5 && check6) {
            valid = true;
        }
    } else if (postalCode.length() == 7) {
        boolean check1 = (Character.isLetter(postalCode.charAt(0))); //letters
        boolean check2 = (Character.isLetter(postalCode.charAt(2)));
        boolean check3 = (Character.isLetter(postalCode.charAt(5)));

        boolean check4 = (Character.isSpace(postalCode.charAt(3))); //space

        boolean check5 = (Character.isDigit(postalCode.charAt(1))); //numbers
        boolean check6 = (Character.isDigit(postalCode.charAt(4)));
        boolean check7 = (Character.isDigit(postalCode.charAt(6)));
        if (check1 && check2 && check3 && check4 && check5 && check6 && check7) {
            valid = true;
        }
    }
    return valid;
}
}
