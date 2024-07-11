package dsw.ms.carrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringMsSisvitaCarreraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsSisvitaCarreraApplication.class, args);
	}

}
