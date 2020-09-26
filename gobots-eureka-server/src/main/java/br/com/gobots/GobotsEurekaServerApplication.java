package br.com.gobots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GobotsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GobotsEurekaServerApplication.class, args);
	}
}
