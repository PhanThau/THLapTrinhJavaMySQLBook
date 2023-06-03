package phanthaucom.example.THJavaLab03.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import phanthaucom.example.THJavaLab03.repository.IuserRepository;
import phanthaucom.example.THJavaLab03.validator.annotation.ValidUsername;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IuserRepository userRepository;

    @Override
    public  boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository==null)
            return true;
        return userRepository.findByUsername(username) == null;
    }

}
