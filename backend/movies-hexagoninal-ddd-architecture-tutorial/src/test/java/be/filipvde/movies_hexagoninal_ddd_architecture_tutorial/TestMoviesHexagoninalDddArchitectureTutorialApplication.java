package be.filipvde.movies_hexagoninal_ddd_architecture_tutorial;

import org.springframework.boot.SpringApplication;

public class TestMoviesHexagoninalDddArchitectureTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.from(MoviesHexagoninalDddArchitectureTutorialApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
