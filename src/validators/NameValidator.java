package validators;

import interfaces.Validator;
import models.User;

public class NameValidator implements Validator {

    @Override
    public void validate(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
    }
}
