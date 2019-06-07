package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.Getter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter
@ToString
public class Order {

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]{10}$")
    private String orderNumber;

    @NotBlank
    private String creationDate;

    @NotNull
    @Valid
    private Customer customer;

    @NotEmpty
    private List<@Valid OrderLine> lines;
}
