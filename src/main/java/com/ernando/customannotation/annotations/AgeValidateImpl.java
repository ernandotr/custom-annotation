package com.ernando.customannotation.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidateImpl implements ConstraintValidator<AgeValidate, Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value != null && value > 0 && value < 200;
    }
}
