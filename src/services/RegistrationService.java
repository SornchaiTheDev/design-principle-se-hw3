// 6510405814 Sornchai Somsakul

package services;

import interfaces.Validator;
import models.User;

import java.util.List;

public class RegistrationService {
    public boolean register(User user, List<Validator> validators) {
        boolean isSuccess = true;
        try {
            for(Validator validator : validators) {
                validator.validate(user);
            }
        }
        catch (Exception e){
            isSuccess = false;
        }

        return isSuccess;
    }
}
