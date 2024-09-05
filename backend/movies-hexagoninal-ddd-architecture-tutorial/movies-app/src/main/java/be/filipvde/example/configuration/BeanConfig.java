package be.filipvde.example.configuration;

import be.filipvde.domain.movies.outbound.MoviesProvider;
import be.filipvde.domain.movies.service.MoviesService;
import be.filipvde.domain.movies.service.MoviesServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MoviesService moviesService(final MoviesProvider moviesProvider) {
        return new MoviesServiceImpl(moviesProvider);
    }
}