package se.omegapoint.opkoko.beanvalidation.constraints;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.lang.annotation.*;

@Min(0)
@Max(0)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@ReportAsSingleViolation
public @interface Range {

    @OverridesAttribute(constraint = Min.class, name = "value")
    long min();

    @OverridesAttribute(constraint = Max.class, name = "value")
    long max();

    String message() default "must be a number between {min} and {max}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
