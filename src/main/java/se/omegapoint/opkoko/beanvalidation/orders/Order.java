package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.Getter;
import lombok.ToString;
import se.omegapoint.opkoko.beanvalidation.constraints.Alphanumeric;
import se.omegapoint.opkoko.beanvalidation.constraints.DateFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
public class Order {

    @NotNull
    //@Pattern(regexp = "^[A-Za-z0-9]{10}$")
    @Alphanumeric
    private String orderNumber;

    //@NotBlank
    @DateFormat
    private String stringDate;

    @PastOrPresent
    private LocalDate creationDate;

    @NotNull
    @Valid
    private Customer customer;

    @NotEmpty
    private List<@Valid OrderLine> lines;
}
