// 6510405814 Sornchai Somsakul

import interfaces.Validator;
import models.User;
import services.RegistrationService;
import validators.AgeValidator;
import validators.EmailValidator;
import validators.NameValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("SornchaiTheDev", "sornchaithedev@gmail.com", 20);
        RegistrationService service = new RegistrationService();

        List<Validator> validators = new ArrayList<Validator>();

        validators.add(new NameValidator());
        validators.add(new EmailValidator());
        validators.add(new AgeValidator());

        boolean isSuccess = service.register(user, validators);

        if (isSuccess) {
            System.out.println("Register Successfully");
        }
        else {
            System.out.println("Something Went Wrong!");
        }
    }
}