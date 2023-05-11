package com.medical.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(MedicalApplication.class, args);
	}

}
