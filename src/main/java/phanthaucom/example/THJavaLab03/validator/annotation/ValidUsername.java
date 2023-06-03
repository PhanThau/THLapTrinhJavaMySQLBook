package phanthaucom.example.THJavaLab03.validator.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import phanthaucom.example.THJavaLab03.validator.ValidUsernameValidator;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "User name already exits";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}