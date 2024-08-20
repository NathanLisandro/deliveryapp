package DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import types.Categoria;

public record SignRestaurant(
        @NotBlank @Size(min = 3, max = 30) String name,
        @NotBlank Categoria category,
        @NotBlank String priceRange,
        @NotBlank Address address


        ) {
}
