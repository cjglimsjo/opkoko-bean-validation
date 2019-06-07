package se.omegapoint.opkoko.beanvalidation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateFormatValidator implements ConstraintValidator<DateFormat, String> {

    @Override
    public void initialize(DateFormat constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true;

        try {
            LocalDate.parse(value);
        } catch (DateTimeParseException e) {
            return false;
        }

        return true;
    }
}
