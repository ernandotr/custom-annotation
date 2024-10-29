package com.ernando.customannotation.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidateImpl.class)
public @interface NameValidate {
    String message() default "Nome inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
