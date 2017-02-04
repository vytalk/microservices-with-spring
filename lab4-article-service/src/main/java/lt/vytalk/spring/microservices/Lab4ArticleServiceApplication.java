package lt.vytalk.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4ArticleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4ArticleServiceApplication.class, args);
	}
}
