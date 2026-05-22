package com.example.CatalogSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CatalogSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogSystemApplication.class, args);
	}

}
