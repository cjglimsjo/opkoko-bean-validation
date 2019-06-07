package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@ToString
public class Customer {

    @NotNull
    @Positive
    private Long id;

    // ...
}
