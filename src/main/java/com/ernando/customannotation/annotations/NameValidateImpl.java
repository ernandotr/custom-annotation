package com.ernando.customannotation.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.ernando.customannotation.annotations.NameValidate;

public class NameValidateImpl implements ConstraintValidator<NameValidate, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() > 0 && value.length() < 10;
    }
}
