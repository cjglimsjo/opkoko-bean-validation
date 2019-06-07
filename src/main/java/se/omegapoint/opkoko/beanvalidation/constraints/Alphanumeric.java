package se.omegapoint.opkoko.beanvalidation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Pattern(regexp = "^[A-Za-z0-9]*$")
@Constraint(validatedBy = {})
@ReportAsSingleViolation
public @interface Alphanumeric {

    String message() default "must be a valid alphanumeric string";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
