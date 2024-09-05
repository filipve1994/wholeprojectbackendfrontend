package be.filipvde.movies_hexagoninal_ddd_architecture_tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MoviesHexagoninalDddArchitectureTutorialApplicationTests {

	@Test
	void contextLoads() {
	}

}
