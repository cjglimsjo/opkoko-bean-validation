package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.Getter;
import lombok.ToString;
import se.omegapoint.opkoko.beanvalidation.constraints.Range;

@Getter
@ToString
public class OrderLine {

    //@Min(1)
    //@Max(99)
    @Range(min = 1, max = 99)
    private Long quantity;

    // ...
}
