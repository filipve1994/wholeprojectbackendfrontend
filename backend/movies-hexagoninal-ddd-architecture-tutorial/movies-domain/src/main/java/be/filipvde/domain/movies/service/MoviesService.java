package be.filipvde.domain.movies.service;

import be.filipvde.domain.movies.model.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie> getPopulars();

    List<Movie> getUpcoming();

    Movie getById(final String id);
}