package be.filipvde.backend_microservice_parent;

import org.springframework.boot.SpringApplication;

public class TestBackendMicroserviceParentApplication {

	public static void main(String[] args) {
		SpringApplication.from(BackendMicroserviceParentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
