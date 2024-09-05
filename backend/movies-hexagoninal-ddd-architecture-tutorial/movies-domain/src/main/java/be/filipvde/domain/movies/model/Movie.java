package be.filipvde.domain.movies.model;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Movie {

    @NotBlank
    private String id;
    @NotBlank
    private String title;
    @NotBlank
    private String synopsys;
    @NotNull
    private Rate rate;
    @NotNull
    private LocalDate releaseDate;
    private Person director;
    private List<Person> actors;
}