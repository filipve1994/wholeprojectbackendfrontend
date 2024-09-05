package be.filipvde.backend_microservice_parent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BackendMicroserviceParentApplicationTests {

	@Test
	void contextLoads() {
	}

}
