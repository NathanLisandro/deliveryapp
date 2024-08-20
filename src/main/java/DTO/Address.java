package DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Address(
        @NotBlank String street,
        @NotNull int number,
        @NotBlank String city
) {
}
