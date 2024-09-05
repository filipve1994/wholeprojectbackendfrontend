package be.filipvde.domain.movies.outbound;

import be.filipvde.domain.movies.model.Movie;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

public interface MoviesProvider {
    @NotNull
    List<Movie> getPopulars();

    @NotNull
    List<Movie> getUpcoming();

    @NotNull
    Optional<Movie> getById(final String id);
}