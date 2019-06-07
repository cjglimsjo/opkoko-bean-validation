package se.omegapoint.opkoko.beanvalidation.orders;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class OrderController {

    @PostMapping("/orders")
    public void order(@Validated @RequestBody Order order) {
        log.info("Received order: " + order);
    }

//    @PostMapping("/orders")
//    public void order(@RequestBody Order order) {
//        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
//
//        Set<ConstraintViolation<Order>> violations = validator.validate(order);
//
//        if (!violations.isEmpty()) {
//            violations.forEach(v -> log.error(v.getPropertyPath() + " " + v.getMessage()));
//            // Return bad request...
//        }
//
//        log.info("Received order: " + order);
//    }
}
