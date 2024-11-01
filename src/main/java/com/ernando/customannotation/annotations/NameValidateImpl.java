package com.ernando.customannotation.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidateImpl implements ConstraintValidator<NameValidate, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length() > 1 && value.length() < 10;
    }
}
