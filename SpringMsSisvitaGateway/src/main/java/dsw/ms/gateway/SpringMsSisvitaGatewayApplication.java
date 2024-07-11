package dsw.ms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringMsSisvitaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsSisvitaGatewayApplication.class, args);
	}

}
