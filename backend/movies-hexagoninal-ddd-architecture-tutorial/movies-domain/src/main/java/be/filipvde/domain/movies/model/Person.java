package be.filipvde.domain.movies.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.validation.constraints.*;
import lombok.Value;

@Value
public class Person {
    @NotNull
    @NotBlank
    String name;
    @NotNull
    @NotBlank
    String firstName;

    @JsonCreator
    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }
}