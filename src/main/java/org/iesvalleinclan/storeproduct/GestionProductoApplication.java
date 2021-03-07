package org.iesvalleinclan.storeproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GestionProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProductoApplication.class, args);
	}

}
