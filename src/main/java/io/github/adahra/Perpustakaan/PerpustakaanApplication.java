package io.github.adahra.Perpustakaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PerpustakaanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerpustakaanApplication.class, args);
	}

}
