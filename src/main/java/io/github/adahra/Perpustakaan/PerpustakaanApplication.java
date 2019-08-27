package io.github.adahra.Perpustakaan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author adnanto
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class PerpustakaanApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PerpustakaanApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Docket perpustakaanApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("io.github.adahra.Perpustakaan")).build();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world from Command Line Runner");
    }
}
