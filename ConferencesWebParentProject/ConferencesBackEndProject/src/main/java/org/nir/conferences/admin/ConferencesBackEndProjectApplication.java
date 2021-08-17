package org.nir.conferences.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"org.nir.conferences.common.entity", "org.nir.conferences.admin.user"})
public class ConferencesBackEndProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferencesBackEndProjectApplication.class, args);
	}

}
