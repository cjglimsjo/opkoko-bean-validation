package se.omegapoint.opkoko.beanvalidation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = DateFormatValidator.class)
public @interface DateFormat {

    String message() default "must be a valid ISO date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
