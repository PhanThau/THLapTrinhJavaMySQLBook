package phanthaucom.example.THJavaLab03.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import phanthaucom.example.THJavaLab03.entity.Category;
import phanthaucom.example.THJavaLab03.validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
