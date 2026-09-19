package com.example.practice2;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;


@ConfigurationProperties(prefix = "app")
@Validated
public record Practice2ApplicationProperties(@NotBlank String name) {
}
