import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidator {
    public static void main(String[] args) {
        System.out.println(validate("john123@gmail.com"));
    }

    public static boolean validate(String emailStr) {
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
}
