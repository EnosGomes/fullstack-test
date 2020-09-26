package br.com.gobots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GobotsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GobotsConfigServerApplication.class, args);
	}
}
