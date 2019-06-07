package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@ToString
public class OrderLine {

    @Min(1)
    @Max(99)
    private Long quantity;

    // ...
}
