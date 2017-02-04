package lt.vytalk.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SubjectServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4SubjectServiceApplication.class, args);
	}
}
