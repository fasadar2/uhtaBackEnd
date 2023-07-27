package com.example.uhta;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Uhta catalog API",
				version = "1.0",
				description = "API for the uhta catalog")
)
public class UhtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UhtaApplication.class, args);
	}

}
