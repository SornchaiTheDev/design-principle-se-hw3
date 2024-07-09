// 6510405814 Sornchai Somsakul

package validators;

import interfaces.Validator;
import models.User;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    @Override
    public void validate(User user) {
        if (user.getEmail() == null || user.getEmail().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }

        String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(user.getEmail()).matches()) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        List<String> notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");
        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }
}
