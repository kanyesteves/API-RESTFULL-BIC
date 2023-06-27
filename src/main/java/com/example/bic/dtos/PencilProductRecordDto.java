package com.example.bic.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PencilProductRecordDto(@NotBlank String name, @NotNull BigDecimal value, @NotNull String description) {
}
